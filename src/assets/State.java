package assets;

public
class State {

    public
    enum Actor {
        DYING,
        FLEEING,
        HUNTING,
        WALKING;
    }

    public
    enum Game {
        GAME_OVER,
        PLAYER_DYING,
        PLAYING,
        TITLE;
    }
}
