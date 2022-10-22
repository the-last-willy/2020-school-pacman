package model;

import model.ai.GhostAI;
import model.grid.Grid;

import assets.Command;
import assets.ID;
import assets.Load;
import assets.Settings;
import assets.Spawn;
import assets.State;
import graphics.animation.Animation;
import numeric.Distance;
import numeric.Arithmetic;
import numeric.Vector2;

import java.awt.event.KeyEvent;
import java.lang.Math;
import java.util.Map;

import static model.grid.Numeric.*;
import static numeric.Arithmetic.*;
import static numeric.Comparison.*;

public
class Model {
    public
    Model() {
        var animations = Load.animations();
        var transitions = Load.transitions();

        grid = new Grid(28, 31, Load.grid());

        ghosts = new Actor[] {
            assets.Actor.cyanGhost(animations, transitions),
            assets.Actor.orangeGhost(animations, transitions),
            assets.Actor.pinkGhost(animations, transitions),
            assets.Actor.redGhost(animations, transitions)
        };

        player = assets.Actor.player(animations, transitions);

        score = new Score();
    }

    public
    void handle(KeyEvent e) {
        if(gameState == State.Game.PLAYING) {
            handlePlaying(e);
        } else if(gameState == State.Game.TITLE) {
            handleTitle(e);
        }
    }

    public
    void handlePlaying(KeyEvent e) {
        switch(e.getKeyCode()) {
        case KeyEvent.VK_LEFT: {
            player.command = Command.MOVE_LEFT;
            break;
        } case KeyEvent.VK_RIGHT: {
            player.command = Command.MOVE_RIGHT;
            break;
        } case KeyEvent.VK_DOWN: {
            player.command = Command.MOVE_DOWN;
            break;
        } case KeyEvent.VK_UP: {
            player.command = Command.MOVE_UP;
            break;
        }}
    }

    public
    void handleTitle(KeyEvent e) {
        gameState = State.Game.PLAYING;
    }

    public
    Vector2 nearestGridPosition(Vector2 position) {
        position = quotient(position, Settings.TRANSITION);
        return modulo(position, dimensions(grid));
    }

    public
    Vector2 roundedGridPosition(Vector2 position) {
        var shift = new Vector2(Settings.TRANSITION / 2, Settings.TRANSITION / 2);
        position = sum(position, shift);
        return nearestGridPosition(position);
    }

    public
    boolean willCollide(Vector2 position, Vector2 direction) {
        var middle = new Vector2(Settings.TRANSITION - 1, Settings.TRANSITION - 1);
        var jump = quotient(sum(product(direction, Settings.TRANSITION + 1), middle), 2);
        position = sum(position, jump);
        return isWall(grid, nearestGridPosition(position));
    }

    private
    void move(Actor a) {
        if(!willCollide(a.position, a.direction)) {
            a.position = sum(a.position, a.direction);
            a.position = modulo(a.position, product(dimensions(grid), Settings.TRANSITION));
        }
    }

    private
    void handleCommand(Actor a) {
        if(a.command == Command.MOVE_LEFT && a.position.j % Settings.TRANSITION == 0) {
            var direction = new Vector2(-1, 0);
            if(!willCollide(a.position, direction)) {
                if(a.state != State.Actor.FLEEING)
                    a.animator.receive(Command.MOVE_LEFT);
                a.direction = direction;
            }
        } else if(a.command == Command.MOVE_RIGHT && a.position.j % Settings.TRANSITION == 0) {
            var direction = new Vector2(1, 0);
            if(!willCollide(a.position, direction)) {
                if(a.state != State.Actor.FLEEING)
                    a.animator.receive(Command.MOVE_RIGHT);
                a.direction = direction;
            }
        } else if(a.command == Command.MOVE_UP && a.position.i % Settings.TRANSITION == 0) {
            var direction = new Vector2(0, -1);
            if(!willCollide(a.position, direction)) {
                if(a.state != State.Actor.FLEEING)
                    a.animator.receive(Command.MOVE_UP);
                a.direction = direction;
            }
        } else if(a.command == Command.MOVE_DOWN && a.position.i % Settings.TRANSITION == 0) {
            var direction = new Vector2(0, 1);
            if(!willCollide(a.position, direction)) {
                if(a.state != State.Actor.FLEEING)
                    a.animator.receive(Command.MOVE_DOWN);
                a.direction = direction;
            }
        }
    }

    private
    void playerDie() {
        gameState = State.Game.PLAYER_DYING;
        player.animator.receive(Command.DIE);
        player.state = State.Actor.DYING;
    }

    private
    void respawn() {
        gameState = State.Game.PLAYING;
        player.direction = Vector2.NULL;
        respawnGhosts();
        respawnPlayer();
    }

    private
    void respawnGhosts() {
        ghosts[0].position = new Vector2(Spawn.CYAN_GHOST);
        ghosts[1].position = new Vector2(Spawn.ORANGE_GHOST);
        ghosts[2].position = new Vector2(Spawn.PINK_GHOST);
        ghosts[3].position = new Vector2(Spawn.RED_GHOST);

        for(var ghost : ghosts) {
            ghost.state = State.Actor.WALKING;
        }
    }

    private
    void respawnPlayer() {
        player.animator.receive(Command.STOP);
        player.direction = new Vector2(Vector2.NULL);
        player.position = new Vector2(Spawn.PLAYER);
        player.state = State.Actor.WALKING;
    }

    public
    void update() {
        if(gameState == State.Game.PLAYER_DYING) {
            updatePlayerDying();
        } else if(gameState == State.Game.PLAYING) {
            updatePlaying();
        } else if(gameState == State.Game.TITLE) {
            updateTitle();
        }
    }

    private
    void updatePlayerDying() {
        if(player.state == State.Actor.DYING) {
            if(player.animator.looped()) {
                stocks -= 1;
                if(stocks >= 0)
                    respawn();
                else
                    gameState = State.Game.GAME_OVER;
            }
        }
        player.animator.tick();
    }

    private
    void updatePlaying() {
        handleCommand(player);
        move(player);

        for(var ghost : ghosts) {
            ghost.ai.command(ghost, this);
            handleCommand(ghost);
            move(ghost);
        }

        {
            var position = roundedGridPosition(player.position);
            if(isPellet(grid, position)) {
                clear(grid, position);
                score.eatPellet();
            } else if(isPowerPellet(grid, position)) {
                remainingPower += Settings.POWER_PELLET_DURATION;
                clear(grid, position);
                player.state = State.Actor.HUNTING;
                score.eatPowerPellet();

                for(var ghost : ghosts) {
                    ghost.animator.receive(Command.FLEE);
                    ghost.state = State.Actor.FLEEING;
                }
            }
        }

        if(player.state == State.Actor.HUNTING) {
            for(var ghost : ghosts) {
                if(Distance.rectilinear(ghost.position, player.position) < Settings.TRANSITION) {
                    ghost.position = new Vector2(Spawn.PLAYER);
                    score.eatGhost();
                }
            }

            remainingPower -= 1;
            if(remainingPower == 0) {
                player.state = State.Actor.WALKING;
                score.resetMultiplier();

                for(var ghost : ghosts)
                    ghost.state = State.Actor.WALKING;
            }
        } else {
            for(var ghost : ghosts) {
                if(Distance.rectilinear(ghost.position, player.position) < Settings.TRANSITION) {    
                    playerDie();
                }
            }
        }

        player.animator.tick();

        for(var ghost : ghosts)
            ghost.animator.tick();
    }

    public
    void updateTitle() {
        display += 1;
    }

    public
    State.Game gameState = State.Game.TITLE;

    public 
    int display = 0;

    public
    int stocks = 2;

    public
    int remainingPower = 0;

    public
    Grid grid;

    public
    Actor[] ghosts;

    public
    Actor player;

    public
    Score score;
}
