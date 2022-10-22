package graphics;

import assets.ID;

public
class Sprite {

    public
    Sprite(ID.Texture texture, Rectangle textureRectangle) {
        this.texture = texture;
        this.textureRectangle = textureRectangle;
    }

    public
    ID.Texture getTexture() {
        return texture;
    }

    public
    Rectangle getTextureRectangle() {
        return textureRectangle;
    }

    private
    ID.Texture texture;

    private
    Rectangle textureRectangle;
}
