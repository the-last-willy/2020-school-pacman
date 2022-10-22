package numeric;

import java.lang.Math;

public
class Distance {

    public static
    int rectilinear(Vector2 lhs, Vector2 rhs) {
        return Math.abs(lhs.i - rhs.i) + Math.abs(lhs.j - rhs.j);
    }
}
