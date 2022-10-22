package assets;

import numeric.Vector2;

import static numeric.Arithmetic.*;

public
class Spawn {

    public static final
    Vector2 CYAN_GHOST = product(new Vector2(1, 29), Settings.TRANSITION);

    public static final 
    Vector2 ORANGE_GHOST = product(new Vector2(26, 29), Settings.TRANSITION);

    public static final
    Vector2 PINK_GHOST = product(new Vector2(26, 1), Settings.TRANSITION);

    public static
    Vector2 PLAYER = product(new Vector2(13, 23), Settings.TRANSITION);

    public static final
    Vector2 RED_GHOST = product(new Vector2(1, 1), Settings.TRANSITION);
}
