package graphics.animation;

public
class Animation {
    
    public
    Animation(int duration, KeyFrame[] keyFrames) {
        this.duration = duration;
        this.keyFrames = keyFrames;
    }

    public
    int getDuration() {
        return duration;
    }

    public
    KeyFrame[] getKeyFrames() {
        return keyFrames;
    }

    private
    int duration;

    private
    KeyFrame[] keyFrames;
}
