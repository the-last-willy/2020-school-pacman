package model.grid;

import numeric.Vector2;

public
class Numeric {
    public static
    Grid clear(Grid g, Vector2 position) {
        return g.clear(position.i, position.j);
    }

    public static
    Vector2 dimensions(Grid g) {
        return new Vector2(g.getWidth(), g.getHeight());
    }

    public static
    boolean isPellet(Grid g, Vector2 position) {
        return g.isPellet(position.i, position.j);
    }

    public static
    boolean isPowerPellet(Grid g, Vector2 position) {
        return g.isPowerPellet(position.i, position.j);
    }

    public static
    boolean isWall(Grid g, Vector2 position) {
        return g.isWall(position.i, position.j);
    }
}
