package model.ai;

import model.Actor;
import model.Model;

public
interface ActorAI {

    public abstract
    void command(Actor a, Model m);
}
