package model;

import model.ai.ActorAI;
import model.ai.NoAI;

import assets.Command;
import assets.ID;
import assets.State;
import numeric.Vector2;

public
class Actor {

    public
    Actor() {
        this.command = Command.NONE;
        this.direction = Vector2.NULL;
    }

    public
    ActorAI ai = new NoAI();

    public
    Animator animator;

    public
    Command command;

    public
    Vector2 direction, position;

    public
    State.Actor state;
}
