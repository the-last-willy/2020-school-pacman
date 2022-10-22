package model;

import assets.Command;
import assets.ID;
import graphics.animation.*;

import java.util.Map;

public
class Animator {

    public
    Animator(
        ID.Animation startingAnimation,
        Map<ID.Animation, Animation> animations,
        Map<Command, ID.Animation> transitions
    ) {
        this.animations = animations;
        this.transitions = transitions;
    
        this.currentAnimation = animations.get(startingAnimation);
        this.currentFrame = 0;

        this.counter = 0;
    }

    public
    boolean looped() {
        return counter == 0;
    }

    public
    void receive(Command c) {
        var previousDuration = currentAnimation.getDuration();

        currentAnimation = animations.get(transitions.get(c));

        if(currentAnimation.getDuration() == previousDuration) {
            currentFrame %= currentAnimation.getKeyFrames().length;
            counter %= currentAnimation.getDuration();
        } else {
            currentFrame = 0;
            counter = 0;
        }
    }

    public
    void tick() {
        var nextFrame = (currentFrame + 1) % currentAnimation.getKeyFrames().length;
        if(counter == currentAnimation.getKeyFrames()[nextFrame].getFrame()) {
            currentFrame = nextFrame;
        }
        counter = (counter + 1) % currentAnimation.getDuration();
    }

    public
    ID.Sprite getSprite() {
        return currentAnimation.getKeyFrames()[currentFrame].getSprite();
    }

    private
    Map<ID.Animation, Animation> animations;
    private
    Map<Command, ID.Animation> transitions;

    private
    Animation currentAnimation;
    private
    int currentFrame;

    private
    int counter;
}
