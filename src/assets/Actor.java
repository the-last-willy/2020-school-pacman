package assets;

import graphics.animation.Animation;
import model.ai.GhostAI;
import model.ai.NoAI;
import model.Animator;
import numeric.Vector2;

import java.util.Map;

public
class Actor {

    public static
    model.Actor cyanGhost(
        Map<ID.Animation, Animation> animations,
        Map<ID.Actor, Map<Command, ID.Animation>> transitions
    ) {
        var a = new model.Actor();

        a.ai = new GhostAI();
        a.animator = new Animator(
            ID.Animation.CYAN_GHOST_MOVING_UP,
            animations,
            transitions.get(ID.Actor.CYAN_GHOST)
        );
        a.position = new Vector2(Spawn.CYAN_GHOST);
        a.state = State.Actor.WALKING;

        return a;
    }

    public static
    model.Actor orangeGhost(
        Map<ID.Animation, Animation> animations,
        Map<ID.Actor, Map<Command, ID.Animation>> transitions
    ) {
        var a = new model.Actor();

        a.ai = new GhostAI();
        a.animator = new Animator(
            ID.Animation.ORANGE_GHOST_MOVING_UP,
            animations,
            transitions.get(ID.Actor.ORANGE_GHOST)
        );
        a.position = new Vector2(Spawn.ORANGE_GHOST);
        a.state = State.Actor.WALKING;

        return a;
    }

    public static
    model.Actor player(
        Map<ID.Animation, Animation> animations,
        Map<ID.Actor, Map<Command, ID.Animation>> transitions
    ) {
        var a = new model.Actor();

        a.ai = new NoAI();
        a.animator = new Animator(
            ID.Animation.PLAYER_IDLE,
            animations,
            transitions.get(ID.Actor.PLAYER)
        );
        a.position = new Vector2(Spawn.PLAYER);
        a.state = State.Actor.WALKING;

        return a;
    }

    public static
    model.Actor pinkGhost(
        Map<ID.Animation, Animation> animations,
        Map<ID.Actor, Map<Command, ID.Animation>> transitions
    ) {
        var a = new model.Actor();

        a.ai = new GhostAI();
        a.animator = new Animator(
            ID.Animation.PINK_GHOST_MOVING_UP,
            animations,
            transitions.get(ID.Actor.PINK_GHOST)
        );
        a.position = new Vector2(Spawn.PINK_GHOST);
        a.state = State.Actor.WALKING;

        return a;
    }

    public static
    model.Actor redGhost(
        Map<ID.Animation, Animation> animations,
        Map<ID.Actor, Map<Command, ID.Animation>> transitions
    ) {
        var a = new model.Actor();

        a.ai = new GhostAI();
        a.animator = new Animator(
            ID.Animation.RED_GHOST_MOVING_UP,
            animations,
            transitions.get(ID.Actor.RED_GHOST)
        );
        a.position = new Vector2(Spawn.RED_GHOST);
        a.state = State.Actor.WALKING;

        return a;
    }
}
