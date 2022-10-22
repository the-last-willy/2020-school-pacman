package graphics.animation;

import assets.ID;

public
class KeyFrame {
    
    public
    KeyFrame(int frame, ID.Sprite sprite) {
        this.frame = frame;
        this.sprite = sprite;
    }

    public
    int getFrame() {
        return frame;
    }

    public
    ID.Sprite getSprite() {
        return sprite;
    }

    public
    int frame;

    public
    ID.Sprite sprite;
}
