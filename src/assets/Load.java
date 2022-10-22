package assets;

import graphics.animation.Animation;
import graphics.animation.KeyFrame;
import graphics.Rectangle;
import graphics.Sprite;
import model.Animator;

import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

import static java.util.Map.entry;

public
class Load {
    public static
    Map<ID.Animation, Animation> animations() {
        return Map.ofEntries(
            entry(ID.Animation.CYAN_GHOST_MOVING_DOWN, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.CYAN_GHOST_MOVING_DOWN_1),
                    new KeyFrame(1, ID.Sprite.CYAN_GHOST_MOVING_DOWN_2)
                }
            )),
            entry(ID.Animation.CYAN_GHOST_MOVING_LEFT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.CYAN_GHOST_MOVING_LEFT_1),
                    new KeyFrame(1, ID.Sprite.CYAN_GHOST_MOVING_LEFT_2)
                }
            )),
            entry(ID.Animation.CYAN_GHOST_MOVING_RIGHT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.CYAN_GHOST_MOVING_RIGHT_1),
                    new KeyFrame(1, ID.Sprite.CYAN_GHOST_MOVING_RIGHT_2)
                }
            )),
            entry(ID.Animation.CYAN_GHOST_MOVING_UP, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.CYAN_GHOST_MOVING_UP_1),
                    new KeyFrame(1, ID.Sprite.CYAN_GHOST_MOVING_UP_2)
                }
            )),
            entry(ID.Animation.GHOST_VULNERABLE, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.GHOST_VULNERABLE_1),
                    new KeyFrame(1, ID.Sprite.GHOST_VULNERABLE_2)
                }
            )),
            entry(ID.Animation.ORANGE_GHOST_MOVING_DOWN, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.ORANGE_GHOST_MOVING_DOWN_1),
                    new KeyFrame(1, ID.Sprite.ORANGE_GHOST_MOVING_DOWN_2)
                }
            )),
            entry(ID.Animation.ORANGE_GHOST_MOVING_LEFT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.ORANGE_GHOST_MOVING_LEFT_1),
                    new KeyFrame(1, ID.Sprite.ORANGE_GHOST_MOVING_LEFT_2)
                }
            )),
            entry(ID.Animation.ORANGE_GHOST_MOVING_RIGHT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.ORANGE_GHOST_MOVING_RIGHT_1),
                    new KeyFrame(1, ID.Sprite.ORANGE_GHOST_MOVING_RIGHT_2)
                }
            )),
            entry(ID.Animation.ORANGE_GHOST_MOVING_UP, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.ORANGE_GHOST_MOVING_UP_1),
                    new KeyFrame(1, ID.Sprite.ORANGE_GHOST_MOVING_UP_2)
                }
            )),
            entry(ID.Animation.PINK_GHOST_MOVING_DOWN, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PINK_GHOST_MOVING_DOWN_1),
                    new KeyFrame(1, ID.Sprite.PINK_GHOST_MOVING_DOWN_2)
                }
            )),
            entry(ID.Animation.PINK_GHOST_MOVING_LEFT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PINK_GHOST_MOVING_LEFT_1),
                    new KeyFrame(1, ID.Sprite.PINK_GHOST_MOVING_LEFT_2)
                }
            )),
            entry(ID.Animation.PINK_GHOST_MOVING_RIGHT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PINK_GHOST_MOVING_RIGHT_1),
                    new KeyFrame(1, ID.Sprite.PINK_GHOST_MOVING_RIGHT_2)
                }
            )),
            entry(ID.Animation.PINK_GHOST_MOVING_UP, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PINK_GHOST_MOVING_UP_1),
                    new KeyFrame(1, ID.Sprite.PINK_GHOST_MOVING_UP_2)
                }
            )),
            entry(ID.Animation.PLAYER_DEATH, new Animation(
                44, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PLAYER_DEATH_1),
                    new KeyFrame(4, ID.Sprite.PLAYER_DEATH_2),
                    new KeyFrame(8, ID.Sprite.PLAYER_DEATH_3),
                    new KeyFrame(12, ID.Sprite.PLAYER_DEATH_4),
                    new KeyFrame(16, ID.Sprite.PLAYER_DEATH_5),
                    new KeyFrame(20, ID.Sprite.PLAYER_DEATH_6),
                    new KeyFrame(24, ID.Sprite.PLAYER_DEATH_7),
                    new KeyFrame(28, ID.Sprite.PLAYER_DEATH_8),
                    new KeyFrame(32, ID.Sprite.PLAYER_DEATH_9),
                    new KeyFrame(36, ID.Sprite.PLAYER_DEATH_10),
                    new KeyFrame(40, ID.Sprite.PLAYER_DEATH_11),
                }
            )),
            entry(ID.Animation.PLAYER_IDLE, new Animation(
                1, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PLAYER_IDLE),
                }
            )),
            entry(ID.Animation.PLAYER_MOVING_DOWN, new Animation(
                8, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PLAYER_IDLE),
                    new KeyFrame(2, ID.Sprite.PLAYER_MOVING_DOWN_1),
                    new KeyFrame(4, ID.Sprite.PLAYER_MOVING_DOWN_2),
                    new KeyFrame(6, ID.Sprite.PLAYER_MOVING_DOWN_1)
                }
            )),
            entry(ID.Animation.PLAYER_MOVING_LEFT, new Animation(
                8, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PLAYER_IDLE),
                    new KeyFrame(2, ID.Sprite.PLAYER_MOVING_LEFT_1),
                    new KeyFrame(4, ID.Sprite.PLAYER_MOVING_LEFT_2),
                    new KeyFrame(6, ID.Sprite.PLAYER_MOVING_LEFT_1)
                }
            )),
            entry(ID.Animation.PLAYER_MOVING_RIGHT, new Animation(
                8, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PLAYER_IDLE),
                    new KeyFrame(2, ID.Sprite.PLAYER_MOVING_RIGHT_1),
                    new KeyFrame(4, ID.Sprite.PLAYER_MOVING_RIGHT_2),
                    new KeyFrame(6, ID.Sprite.PLAYER_MOVING_RIGHT_1)
                }
            )),
            entry(ID.Animation.PLAYER_MOVING_UP, new Animation(
                8, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.PLAYER_IDLE),
                    new KeyFrame(2, ID.Sprite.PLAYER_MOVING_UP_1),
                    new KeyFrame(4, ID.Sprite.PLAYER_MOVING_UP_2),
                    new KeyFrame(6, ID.Sprite.PLAYER_MOVING_UP_1)
                }
            )),
            entry(ID.Animation.RED_GHOST_MOVING_DOWN, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.RED_GHOST_MOVING_DOWN_1),
                    new KeyFrame(1, ID.Sprite.RED_GHOST_MOVING_DOWN_2)
                }
            )),
            entry(ID.Animation.RED_GHOST_MOVING_LEFT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.RED_GHOST_MOVING_LEFT_1),
                    new KeyFrame(1, ID.Sprite.RED_GHOST_MOVING_LEFT_2)
                }
            )),
            entry(ID.Animation.RED_GHOST_MOVING_RIGHT, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.RED_GHOST_MOVING_RIGHT_1),
                    new KeyFrame(1, ID.Sprite.RED_GHOST_MOVING_RIGHT_2)
                }
            )),
            entry(ID.Animation.RED_GHOST_MOVING_UP, new Animation(
                2, new KeyFrame[] {
                    new KeyFrame(0, ID.Sprite.RED_GHOST_MOVING_UP_1),
                    new KeyFrame(1, ID.Sprite.RED_GHOST_MOVING_UP_2)
                }
            ))
        );
    }

    public static
    Map<Character, Sprite> characters() {
        return Map.ofEntries(
            entry('0', new Sprite(ID.Texture.MAIN, new Rectangle(0, 0, 12, 12))),
            entry('1', new Sprite(ID.Texture.MAIN, new Rectangle(12, 0, 12, 12))),
            entry('2', new Sprite(ID.Texture.MAIN, new Rectangle(24, 0, 12, 12))),
            entry('3', new Sprite(ID.Texture.MAIN, new Rectangle(36, 0, 12, 12))),
            entry('4', new Sprite(ID.Texture.MAIN, new Rectangle(48, 0, 12, 12))),
            entry('5', new Sprite(ID.Texture.MAIN, new Rectangle(60, 0, 12, 12))),
            entry('6', new Sprite(ID.Texture.MAIN, new Rectangle(72, 0, 12, 12))),
            entry('7', new Sprite(ID.Texture.MAIN, new Rectangle(84, 0, 12, 12))),
            entry('8', new Sprite(ID.Texture.MAIN, new Rectangle(96, 0, 12, 12))),
            entry('9', new Sprite(ID.Texture.MAIN, new Rectangle(108, 0, 12, 12))),
            entry(' ', new Sprite(ID.Texture.MAIN, new Rectangle(0, 24, 12, 12))),
            entry('a', new Sprite(ID.Texture.MAIN, new Rectangle(12, 24, 12, 12))),
            entry('b', new Sprite(ID.Texture.MAIN, new Rectangle(24, 24, 12, 12))),
            entry('c', new Sprite(ID.Texture.MAIN, new Rectangle(36, 24, 12, 12))),
            entry('d', new Sprite(ID.Texture.MAIN, new Rectangle(48, 24, 12, 12))),
            entry('e', new Sprite(ID.Texture.MAIN, new Rectangle(60, 24, 12, 12))),
            entry('f', new Sprite(ID.Texture.MAIN, new Rectangle(72, 24, 12, 12))),
            entry('g', new Sprite(ID.Texture.MAIN, new Rectangle(84, 24, 12, 12))),
            entry('h', new Sprite(ID.Texture.MAIN, new Rectangle(96, 24, 12, 12))),
            entry('i', new Sprite(ID.Texture.MAIN, new Rectangle(108, 24, 12, 12))),
            entry('j', new Sprite(ID.Texture.MAIN, new Rectangle(120, 24, 12, 12))),
            entry('k', new Sprite(ID.Texture.MAIN, new Rectangle(132, 24, 12, 12))),
            entry('l', new Sprite(ID.Texture.MAIN, new Rectangle(144, 24, 12, 12))),
            entry('m', new Sprite(ID.Texture.MAIN, new Rectangle(156, 24, 12, 12))),
            entry('n', new Sprite(ID.Texture.MAIN, new Rectangle(168, 24, 12, 12))),
            entry('o', new Sprite(ID.Texture.MAIN, new Rectangle(180, 24, 12, 12))),
            entry('p', new Sprite(ID.Texture.MAIN, new Rectangle(192, 24, 12, 12))),
            entry('q', new Sprite(ID.Texture.MAIN, new Rectangle(204, 24, 12, 12))),
            entry('r', new Sprite(ID.Texture.MAIN, new Rectangle(216, 24, 12, 12))),
            entry('s', new Sprite(ID.Texture.MAIN, new Rectangle(228, 24, 12, 12))),
            entry('t', new Sprite(ID.Texture.MAIN, new Rectangle(240, 24, 12, 12))),
            entry('u', new Sprite(ID.Texture.MAIN, new Rectangle(252, 24, 12, 12))),
            entry('v', new Sprite(ID.Texture.MAIN, new Rectangle(264, 24, 12, 12))),
            entry('w', new Sprite(ID.Texture.MAIN, new Rectangle(276, 24, 12, 12))),
            entry('x', new Sprite(ID.Texture.MAIN, new Rectangle(288, 24, 12, 12))),
            entry('y', new Sprite(ID.Texture.MAIN, new Rectangle(300, 24, 12, 12))),
            entry('z', new Sprite(ID.Texture.MAIN, new Rectangle(312, 24, 12, 12)))
        );
    }

    public static
    int[][] grid() {
        return new int[][] {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,3,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,3,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,2,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,2,1},
            {1,2,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,2,1,1,1,1,1,0,1,1,0,1,1,1,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,1,1,1,0,1,1,0,1,1,1,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,0,1,1,1,1,1,1,1,1,0,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,0,1,0,0,0,0,0,0,1,0,1,1,2,1,1,1,1,1,1},
            {0,0,0,0,0,0,2,0,0,0,1,0,0,0,0,0,0,1,0,0,0,2,0,0,0,0,0,0},
            {1,1,1,1,1,1,2,1,1,0,1,0,0,0,0,0,0,1,0,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,0,1,1,1,1,1,1,1,1,0,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,0,1,1,1,1,1,1,1,1,0,1,1,2,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,1,1,0,1,1,1,1,1,1,1,1,0,1,1,2,1,1,1,1,1,1},
            {1,3,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,3,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,2,2,1,1,2,2,2,2,2,2,2,0,0,2,2,2,2,2,2,2,1,1,2,2,2,1},
            {1,1,1,2,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,2,1,1,1},
            {1,1,1,2,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,2,1,1,1},
            {1,2,2,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,2,2,1},
            {1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},
            {1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };
    }

    public static
    Map<ID.Sprite, Sprite> sprites() {
        return Map.ofEntries(
            entry(ID.Sprite.CYAN_GHOST_MOVING_DOWN_1, new Sprite(ID.Texture.MAIN, new Rectangle(10 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.CYAN_GHOST_MOVING_DOWN_2, new Sprite(ID.Texture.MAIN, new Rectangle(11 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.CYAN_GHOST_MOVING_LEFT_1, new Sprite(ID.Texture.MAIN, new Rectangle(12 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.CYAN_GHOST_MOVING_LEFT_2, new Sprite(ID.Texture.MAIN, new Rectangle(13 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.CYAN_GHOST_MOVING_RIGHT_1, new Sprite(ID.Texture.MAIN, new Rectangle(8 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.CYAN_GHOST_MOVING_RIGHT_2, new Sprite(ID.Texture.MAIN, new Rectangle(9 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.CYAN_GHOST_MOVING_UP_1, new Sprite(ID.Texture.MAIN, new Rectangle(14 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.CYAN_GHOST_MOVING_UP_2, new Sprite(ID.Texture.MAIN, new Rectangle(15 * 24, 8 * 24, 24, 24))),

            entry(ID.Sprite.GHOST_VULNERABLE_1, new Sprite(ID.Texture.MAIN, new Rectangle(8 * 24, 4 * 24, 24, 24))),
            entry(ID.Sprite.GHOST_VULNERABLE_2, new Sprite(ID.Texture.MAIN, new Rectangle(9 * 24, 4 * 24, 24, 24))),

            entry(ID.Sprite.FRUIT, new Sprite(ID.Texture.MAIN, new Rectangle(1 * 24, 5 * 24, 24, 24))),
            
            entry(ID.Sprite.ORANGE_GHOST_MOVING_DOWN_1, new Sprite(ID.Texture.MAIN, new Rectangle(2 * 24, 9 * 24, 24, 24))),
            entry(ID.Sprite.ORANGE_GHOST_MOVING_DOWN_2, new Sprite(ID.Texture.MAIN, new Rectangle(3 * 24, 9 * 24, 24, 24))),
            entry(ID.Sprite.ORANGE_GHOST_MOVING_LEFT_1, new Sprite(ID.Texture.MAIN, new Rectangle(4 * 24, 9 * 24, 24, 24))),
            entry(ID.Sprite.ORANGE_GHOST_MOVING_LEFT_2, new Sprite(ID.Texture.MAIN, new Rectangle(5 * 24, 9 * 24, 24, 24))),
            entry(ID.Sprite.ORANGE_GHOST_MOVING_RIGHT_1, new Sprite(ID.Texture.MAIN, new Rectangle(0 * 24, 9 * 24, 24, 24))),
            entry(ID.Sprite.ORANGE_GHOST_MOVING_RIGHT_2, new Sprite(ID.Texture.MAIN, new Rectangle(1 * 24, 9 * 24, 24, 24))),
            entry(ID.Sprite.ORANGE_GHOST_MOVING_UP_1, new Sprite(ID.Texture.MAIN, new Rectangle(6 * 24, 9 * 24, 24, 24))),
            entry(ID.Sprite.ORANGE_GHOST_MOVING_UP_2, new Sprite(ID.Texture.MAIN, new Rectangle(7 * 24, 9 * 24, 24, 24))),

            entry(ID.Sprite.PELLET, new Sprite(ID.Texture.MAIN, new Rectangle(8 * 24, 0 * 24, 12, 12))),

            entry(ID.Sprite.PINK_GHOST_MOVING_DOWN_1, new Sprite(ID.Texture.MAIN, new Rectangle(2 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.PINK_GHOST_MOVING_DOWN_2, new Sprite(ID.Texture.MAIN, new Rectangle(3 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.PINK_GHOST_MOVING_LEFT_1, new Sprite(ID.Texture.MAIN, new Rectangle(4 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.PINK_GHOST_MOVING_LEFT_2, new Sprite(ID.Texture.MAIN, new Rectangle(5 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.PINK_GHOST_MOVING_RIGHT_1, new Sprite(ID.Texture.MAIN, new Rectangle(0 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.PINK_GHOST_MOVING_RIGHT_2, new Sprite(ID.Texture.MAIN, new Rectangle(1 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.PINK_GHOST_MOVING_UP_1, new Sprite(ID.Texture.MAIN, new Rectangle(6 * 24, 8 * 24, 24, 24))),
            entry(ID.Sprite.PINK_GHOST_MOVING_UP_2, new Sprite(ID.Texture.MAIN, new Rectangle(7 * 24, 8 * 24, 24, 24))),

            entry(ID.Sprite.PLAYER_DEATH_1, new Sprite(ID.Texture.MAIN, new Rectangle(96, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_2, new Sprite(ID.Texture.MAIN, new Rectangle(120, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_3, new Sprite(ID.Texture.MAIN, new Rectangle(144, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_4, new Sprite(ID.Texture.MAIN, new Rectangle(168, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_5, new Sprite(ID.Texture.MAIN, new Rectangle(192, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_6, new Sprite(ID.Texture.MAIN, new Rectangle(216, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_7, new Sprite(ID.Texture.MAIN, new Rectangle(240, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_8, new Sprite(ID.Texture.MAIN, new Rectangle(264, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_9, new Sprite(ID.Texture.MAIN, new Rectangle(288, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_10, new Sprite(ID.Texture.MAIN, new Rectangle(312, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_DEATH_11, new Sprite(ID.Texture.MAIN, new Rectangle(336, 168, 24, 24))),
            entry(ID.Sprite.PLAYER_IDLE, new Sprite(ID.Texture.MAIN, new Rectangle(0 * 24, 7 * 24, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_DOWN_1, new Sprite(ID.Texture.MAIN, new Rectangle(168, 72, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_DOWN_2, new Sprite(ID.Texture.MAIN, new Rectangle(120, 72, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_LEFT_1, new Sprite(ID.Texture.MAIN, new Rectangle(48, 72, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_LEFT_2, new Sprite(ID.Texture.MAIN, new Rectangle(0, 72, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_RIGHT_1, new Sprite(ID.Texture.MAIN, new Rectangle(144, 72, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_RIGHT_2, new Sprite(ID.Texture.MAIN, new Rectangle(96, 72, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_UP_1, new Sprite(ID.Texture.MAIN, new Rectangle(72, 72, 24, 24))),
            entry(ID.Sprite.PLAYER_MOVING_UP_2, new Sprite(ID.Texture.MAIN, new Rectangle(24, 72, 24, 24))),

            entry(ID.Sprite.POWER_PELLET, new Sprite(ID.Texture.MAIN, new Rectangle(10 * 24, 0 * 24, 12, 12))),
    
            entry(ID.Sprite.RED_GHOST_MOVING_DOWN_1, new Sprite(ID.Texture.MAIN, new Rectangle(2 * 24, 6 * 24, 24, 24))),
            entry(ID.Sprite.RED_GHOST_MOVING_DOWN_2, new Sprite(ID.Texture.MAIN, new Rectangle(3 * 24, 6 * 24, 24, 24))),
            entry(ID.Sprite.RED_GHOST_MOVING_LEFT_1, new Sprite(ID.Texture.MAIN, new Rectangle(4 * 24, 6 * 24, 24, 24))),
            entry(ID.Sprite.RED_GHOST_MOVING_LEFT_2, new Sprite(ID.Texture.MAIN, new Rectangle(5 * 24, 6 * 24, 24, 24))),
            entry(ID.Sprite.RED_GHOST_MOVING_RIGHT_1, new Sprite(ID.Texture.MAIN, new Rectangle(0 * 24, 6 * 24, 24, 24))),
            entry(ID.Sprite.RED_GHOST_MOVING_RIGHT_2, new Sprite(ID.Texture.MAIN, new Rectangle(1 * 24, 6 * 24, 24, 24))),
            entry(ID.Sprite.RED_GHOST_MOVING_UP_1, new Sprite(ID.Texture.MAIN, new Rectangle(6 * 24, 6 * 24, 24, 24))),
            entry(ID.Sprite.RED_GHOST_MOVING_UP_2, new Sprite(ID.Texture.MAIN, new Rectangle(7 * 24, 6 * 24, 24, 24))),

            entry(ID.Sprite.TERRAIN, new Sprite(ID.Texture.TERRAIN, new Rectangle(0, 0, 672, 744)))
        );
    }

    public static
    Map<ID.Texture, Image> textures() {
        return Map.ofEntries(
            entry(ID.Texture.MAIN, image("assets/main.png")),
            entry(ID.Texture.TERRAIN, image("assets/terrain.png"))
        );
    }

    public static
    Map<ID.Actor, Map<Command, ID.Animation>> transitions() {
        return Map.ofEntries(
            entry(ID.Actor.CYAN_GHOST, Map.ofEntries(
                entry(Command.FLEE, ID.Animation.GHOST_VULNERABLE),
                entry(Command.MOVE_DOWN, ID.Animation.CYAN_GHOST_MOVING_DOWN),
                entry(Command.MOVE_LEFT, ID.Animation.CYAN_GHOST_MOVING_LEFT),
                entry(Command.MOVE_RIGHT, ID.Animation.CYAN_GHOST_MOVING_RIGHT),
                entry(Command.MOVE_UP, ID.Animation.CYAN_GHOST_MOVING_UP)
            )),
            entry(ID.Actor.ORANGE_GHOST, Map.ofEntries(
                entry(Command.FLEE, ID.Animation.GHOST_VULNERABLE),
                entry(Command.MOVE_DOWN, ID.Animation.ORANGE_GHOST_MOVING_DOWN),
                entry(Command.MOVE_LEFT, ID.Animation.ORANGE_GHOST_MOVING_LEFT),
                entry(Command.MOVE_RIGHT, ID.Animation.ORANGE_GHOST_MOVING_RIGHT),
                entry(Command.MOVE_UP, ID.Animation.ORANGE_GHOST_MOVING_UP)
            )),
            entry(ID.Actor.PLAYER, Map.ofEntries(
                entry(Command.DIE, ID.Animation.PLAYER_DEATH),
                entry(Command.MOVE_DOWN, ID.Animation.PLAYER_MOVING_DOWN),
                entry(Command.MOVE_LEFT, ID.Animation.PLAYER_MOVING_LEFT),
                entry(Command.MOVE_RIGHT, ID.Animation.PLAYER_MOVING_RIGHT),
                entry(Command.MOVE_UP, ID.Animation.PLAYER_MOVING_UP),
                entry(Command.STOP, ID.Animation.PLAYER_IDLE)
            )),
            entry(ID.Actor.PINK_GHOST, Map.ofEntries(
                entry(Command.FLEE, ID.Animation.GHOST_VULNERABLE),
                entry(Command.MOVE_DOWN, ID.Animation.PINK_GHOST_MOVING_DOWN),
                entry(Command.MOVE_LEFT, ID.Animation.PINK_GHOST_MOVING_LEFT),
                entry(Command.MOVE_RIGHT, ID.Animation.PINK_GHOST_MOVING_RIGHT),
                entry(Command.MOVE_UP, ID.Animation.PINK_GHOST_MOVING_UP)
            )),
            entry(ID.Actor.RED_GHOST, Map.ofEntries(
                entry(Command.FLEE, ID.Animation.GHOST_VULNERABLE),
                entry(Command.MOVE_DOWN, ID.Animation.RED_GHOST_MOVING_DOWN),
                entry(Command.MOVE_LEFT, ID.Animation.RED_GHOST_MOVING_LEFT),
                entry(Command.MOVE_RIGHT, ID.Animation.RED_GHOST_MOVING_RIGHT),
                entry(Command.MOVE_UP, ID.Animation.RED_GHOST_MOVING_UP)
            ))
        );
    }

    private static
    BufferedImage image(String file) {
        try {
            return ImageIO.read(new File(file));
        } catch(Exception e) {
            System.out.println("--Failed to load " + file);
            return null;
        }
    }
}
