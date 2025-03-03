package assets;

public
class ID {
    public
    enum Actor {
        CYAN_GHOST,
        ORANGE_GHOST,
        PINK_GHOST,
        PLAYER,
        RED_GHOST;
    }

    public
    enum Animation {
        CYAN_GHOST_MOVING_DOWN,
        CYAN_GHOST_MOVING_LEFT,
        CYAN_GHOST_MOVING_RIGHT,
        CYAN_GHOST_MOVING_UP,

        GHOST_VULNERABLE,

        ORANGE_GHOST_MOVING_DOWN,
        ORANGE_GHOST_MOVING_LEFT,
        ORANGE_GHOST_MOVING_RIGHT,
        ORANGE_GHOST_MOVING_UP,

        PINK_GHOST_MOVING_DOWN,
        PINK_GHOST_MOVING_LEFT,
        PINK_GHOST_MOVING_RIGHT,
        PINK_GHOST_MOVING_UP,

        PLAYER_DEATH,
        PLAYER_IDLE,
        PLAYER_MOVING_DOWN,
        PLAYER_MOVING_LEFT,
        PLAYER_MOVING_RIGHT,
        PLAYER_MOVING_UP,

        RED_GHOST_MOVING_DOWN,
        RED_GHOST_MOVING_LEFT,
        RED_GHOST_MOVING_RIGHT,
        RED_GHOST_MOVING_UP;
    }

    public
    enum Sprite {
        GHOST_VULNERABLE_1,
        GHOST_VULNERABLE_2,

        CYAN_GHOST_MOVING_DOWN_1,
        CYAN_GHOST_MOVING_DOWN_2,
        CYAN_GHOST_MOVING_LEFT_1,
        CYAN_GHOST_MOVING_LEFT_2,
        CYAN_GHOST_MOVING_RIGHT_1,
        CYAN_GHOST_MOVING_RIGHT_2,
        CYAN_GHOST_MOVING_UP_1,
        CYAN_GHOST_MOVING_UP_2,

        FRUIT,

        ORANGE_GHOST_MOVING_DOWN_1,
        ORANGE_GHOST_MOVING_DOWN_2,
        ORANGE_GHOST_MOVING_LEFT_1,
        ORANGE_GHOST_MOVING_LEFT_2,
        ORANGE_GHOST_MOVING_RIGHT_1,
        ORANGE_GHOST_MOVING_RIGHT_2,
        ORANGE_GHOST_MOVING_UP_1,
        ORANGE_GHOST_MOVING_UP_2,

        PELLET,

        PINK_GHOST_MOVING_DOWN_1,
        PINK_GHOST_MOVING_DOWN_2,
        PINK_GHOST_MOVING_LEFT_1,
        PINK_GHOST_MOVING_LEFT_2,
        PINK_GHOST_MOVING_RIGHT_1,
        PINK_GHOST_MOVING_RIGHT_2,
        PINK_GHOST_MOVING_UP_1,
        PINK_GHOST_MOVING_UP_2,

        PLAYER_IDLE,
        PLAYER_MOVING_DOWN_1,
        PLAYER_MOVING_DOWN_2,
        PLAYER_DEATH_1,
        PLAYER_DEATH_2,
        PLAYER_DEATH_3,
        PLAYER_DEATH_4,
        PLAYER_DEATH_5,
        PLAYER_DEATH_6,
        PLAYER_DEATH_7,
        PLAYER_DEATH_8,
        PLAYER_DEATH_9,
        PLAYER_DEATH_10,
        PLAYER_DEATH_11,
        PLAYER_MOVING_LEFT_1,
        PLAYER_MOVING_LEFT_2,
        PLAYER_MOVING_RIGHT_1,
        PLAYER_MOVING_RIGHT_2,
        PLAYER_MOVING_UP_1,
        PLAYER_MOVING_UP_2,

        POWER_PELLET,

        RED_GHOST_MOVING_DOWN_1,
        RED_GHOST_MOVING_DOWN_2,
        RED_GHOST_MOVING_LEFT_1,
        RED_GHOST_MOVING_LEFT_2,
        RED_GHOST_MOVING_RIGHT_1,
        RED_GHOST_MOVING_RIGHT_2,
        RED_GHOST_MOVING_UP_1,
        RED_GHOST_MOVING_UP_2,
        TERRAIN;
    }

    public
    enum Texture {
        MAIN,
        TERRAIN;
    }
}
