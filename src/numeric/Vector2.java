package numeric;

public
class Vector2 {

    public
    Vector2(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public
    Vector2(Vector2 v) {
        i = v.i;
        j = v.j;
    }

    public
    int i, j;

    public static final
    Vector2 NULL = new Vector2(0, 0);
}
