package view;

import assets.*;
import graphics.*;
import model.Model;
import numeric.Fraction;
import numeric.Transformation2;
import numeric.Vector2;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

import static model.grid.Numeric.*;
import static numeric.Arithmetic.*;

public
class View {

    public
    View() {
        this.renderer = new Renderer(
            Load.textures(), Load.sprites(), Load.characters()
        );

        actorToView = new Transformation2(
            new Fraction(Settings.SIDE_LENGTH, Settings.TRANSITION),
            new Vector2(0, 24)
        );

        gridToView = new Transformation2(
            new Fraction(Settings.SIDE_LENGTH),
            new Vector2(0, 24)
        );
    }

    public
    void render(Graphics g, Model m) {
        if(m.gameState == State.Game.GAME_OVER) {
            renderGameOver(g, m);
        } else if(m.gameState == State.Game.PLAYER_DYING) {
            renderPlayerDying(g, m);
        } else if(m.gameState == State.Game.PLAYING) {
            renderPlaying(g, m);
        } else if(m.gameState == State.Game.TITLE) {
            renderTitle(g, m);
        }
    }

    public
    void renderGameOver(Graphics g, Model m) {
        renderWalls(g, m);
        renderPellets(g, m);
        renderScore(g, m);
        
        renderer.render(g, " game  over ", product(new Vector2(17, 18), Settings.SIDE_LENGTH));   
    }

    public
    void renderPlayerDying(Graphics g, Model m) {
        renderWalls(g, m);
        renderPellets(g, m);
        renderPlayer(g, m);
        renderScore(g, m);
        renderStocks(g, m);
    }

    public
    void renderPlaying(Graphics g, Model m) {
        renderWalls(g, m);
        renderPellets(g, m);
        renderGhosts(g, m);
        renderPlayer(g, m);
        renderScore(g, m);
        renderStocks(g, m);
    }

    public
    void renderTitle(Graphics g, Model m) {
        renderer.render(g, "pac man", product(new Vector2(16, 11), Settings.SIDE_LENGTH));

        if(m.display % 60 < 30) {
            renderer.render(g, "press any key ", product(new Vector2(18, 13), Settings.SIDE_LENGTH));
            renderer.render(g, "to start", product(new Vector2(16, 14), Settings.SIDE_LENGTH));
        }

        
        renderer.render(g, "par yoan parra", product(new Vector2(17, 18), Settings.SIDE_LENGTH));
        renderer.render(g, "et willy jacquet", product(new Vector2(17, 19), Settings.SIDE_LENGTH)); 
    }

    private
    void renderGhosts(Graphics g, Model m) {
        for(var ghost : m.ghosts)
            renderer.render(g, ghost.animator.getSprite(), product(actorToView, ghost.position));
    }

    private
    void renderPellets(Graphics g, Model m) {
        for(int i = 0; i < m.grid.getWidth(); ++i)
        for(int j = 0; j < m.grid.getHeight(); ++j) {
            if(m.grid.isPellet(i, j)) {
                var position = sum(product(gridToView, new Vector2(i, j)), new Vector2(Settings.SIDE_LENGTH / 4, Settings.SIDE_LENGTH / 4));
                renderer.render(g, ID.Sprite.PELLET, position);
            } else if(m.grid.isPowerPellet(i, j)) {
                var position = sum(product(gridToView, new Vector2(i, j)), new Vector2(Settings.SIDE_LENGTH / 4, Settings.SIDE_LENGTH / 4));
                renderer.render(g, ID.Sprite.POWER_PELLET, position);
            }
        }
    }

    private
    void renderPlayer(Graphics g, Model m) {
        renderer.render(g, m.player.animator.getSprite(), product(actorToView, m.player.position));
    }

    private
    void renderScore(Graphics g, Model m) {
        renderer.render(g, "score", sum(product(gridToView, new Vector2(23, -1)), new Vector2(0, 12)));
        renderer.render(g, Integer.toString(m.score.getValue()), sum(product(gridToView, new Vector2(27, -1)), new Vector2(0, 12)));
    }

    private
    void renderStocks(Graphics g, Model m) {
        for(int i = 0; i < m.stocks; ++i) {
            renderer.render(g, ID.Sprite.PLAYER_MOVING_LEFT_1, product(new Vector2(2 - i, 0), Settings.SIDE_LENGTH));
        }
    }

    private
    void renderWalls(Graphics g, Model m) {
        renderer.render(g, ID.Sprite.TERRAIN, product(gridToView, Vector2.NULL));
    }

    private
    Renderer renderer;

    public
    Transformation2 actorToView;

    public
    Transformation2 gridToView;

    public
    Transformation2 pelletToView;
}
