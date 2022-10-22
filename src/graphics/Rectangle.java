package graphics;

import numeric.Vector2;

public
class Rectangle {

    public
    Rectangle(int i, int j, int width, int height) {
        this.position = new Vector2(i, j);
        this.dimensions = new Vector2(width, height);
    }

    public
    Rectangle(Vector2 position, Vector2 dimensions) {
       this.position = position;
       this.dimensions = dimensions;
    }

    Rectangle(Rectangle r) {
        position = r.position;
        dimensions = r.dimensions;
    }

    public
    Vector2 position, dimensions;
}
