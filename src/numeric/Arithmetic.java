package numeric;

public
class Arithmetic {
    public static
    int modulo(int lhs, int rhs) {
        return (lhs % rhs + rhs) % rhs;
    }

    // Fraction ////////////////////////////////////////////////////////////////

    public static
    Fraction product(Fraction lhs, Fraction rhs) {
        return new Fraction(
            lhs.getNumerator() * rhs.getNumerator(),
            lhs.getDenominator() * rhs.getDenominator()
        );
    }

    // Vector2 /////////////////////////////////////////////////////////////////

    public static
    Vector2 opposite(Vector2 v) {
        return new Vector2(-v.i, -v.j);
    }

    public static
    Vector2 product(Vector2 v, int s) {
        return new Vector2(v.i * s, v.j * s);
    }

    public static
    Vector2 product(int s, Vector2 v) {
        return product(v, s);
    }

    public static
    Vector2 product(Vector2 v, Fraction f) {
        return quotient(product(v, f.getNumerator()), f.getDenominator());
    }

    public static
    Vector2 product(Fraction f, Vector2 v) {
        return product(v, f);
    }

    public static
    Vector2 product(Transformation2 t, Vector2 v) {
        return sum(product(v, t.getScaling()), t.getTranslation());
    }

    public static
    Vector2 quotient(Vector2 v, int s) {
        return new Vector2(v.i / s, v.j / s);
    }

    public static
    Vector2 modulo(Vector2 lhs, Vector2 rhs) {
        return new Vector2(
            Arithmetic.modulo(lhs.i, rhs.i),
            Arithmetic.modulo(lhs.j, rhs.j)
        );
    }

    public static
    Vector2 sum(Vector2 lhs, Vector2 rhs) {
        return new Vector2(lhs.i + rhs.i, lhs.j + rhs.j);
    }

    public static
    Vector2 difference(Vector2 lhs, Vector2 rhs) {
        return new Vector2(lhs.i + rhs.i, lhs.j + rhs.j);
    }
    
    // Transformation2 //////////////////////////////////////////////////////////

    public static
    Transformation2 product(Transformation2 lhs, Transformation2 rhs) {
        var scaling = product(lhs.getScaling(), rhs.getScaling());
        var translation = sum(product(lhs.getScaling(), rhs.getTranslation()), lhs.getTranslation());
        return new Transformation2(scaling, translation);
    }
}
