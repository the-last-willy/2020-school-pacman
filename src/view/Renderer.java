package view;

import assets.ID;
import assets.Settings;
import graphics.Rectangle;
import graphics.Sprite;
import numeric.Transformation2;
import numeric.Vector2;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Map;

import static numeric.Arithmetic.*;

public
class Renderer {

    public
    Renderer(
        Map<ID.Texture, Image> textures,
        Map<ID.Sprite, Sprite> sprites,
        Map<Character, Sprite> characters
    ) {
        this.textures = textures;
        this.sprites = sprites;
        this.characters = characters;
    }

    public
    void render(Graphics g, ID.Sprite s, Vector2 position) {
        render(g, sprites.get(s), position);
    }

    public
    void render(Graphics g, String text, Vector2 position) {
        char[] c = text.toCharArray();
        for(int i = 0; i < text.length(); ++i) {
            position.i -= Settings.SIDE_LENGTH / 2;
            render(g, c[text.length() - 1 - i], position);
        }
    }
    
    private
    void render(Graphics g, Character c, Vector2 position) {
        render(g, characters.get(c), position);
    }

    private
    void render(Graphics g, Sprite s, Vector2 position) {
        render(
            g,
            textures.get(s.getTexture()),
            s.getTextureRectangle(),
            new Rectangle(new Vector2(position), new Vector2(s.getTextureRectangle().dimensions))
        );
    }

    private
    void render(Graphics g, Image texture, Rectangle source, Rectangle destination) {
        render(
            g, texture,
            source.position, sum(source.position, source.dimensions),
            destination.position, sum(destination.position, destination.dimensions)
        );
    }

    private
    void render(
        Graphics g, Image texture, 
        Vector2 sourceTopLeft, Vector2 sourceBottomRight,
        Vector2 destinationTopLeft, Vector2 destinationBottomRight    
    ) {
        g.drawImage(
            texture,
            destinationTopLeft.i, destinationTopLeft.j,
            destinationBottomRight.i, destinationBottomRight.j,
            sourceTopLeft.i, sourceTopLeft.j,
            sourceBottomRight.i, sourceBottomRight.j,
            null
        );
    }

    private
    Map<Character, Sprite> characters;

    private
    Map<ID.Sprite, Sprite> sprites;

    private
    Map<ID.Texture, Image> textures;
}
