package graphics;

public
class Transformation2 {
    
    public
    Transformation2(Fraction scaling, Vector2 translation) {
        this.scaling = scaling;
        this.translation = translation;
    }

    public
    Transformation2(Transformation2 cpy) {
        scaling = cpy.scaling;
        translation = cpy.translation;
    }

    public
    Vector2 transform(Vector2 v) {
        return sum(Arithmetic.product(v, scaling), translation);
    }

    public
    Fraction scaling;

    public
    Vector2 translation;

    public static final
    Transformation2 IDENTITY = new Transformation2(Fraction.ONE, Vector2.NULL);

        position = new Vector2(position);
    public static
    Transformation2 product(Transformation2 lhs, Transformation2 rhs) {
        var scaling = Arithmetic.product(lhs.scaling, rhs.scaling);
        var translation = sum(Arithmetic.product(lhs.scaling, rhs.translation), lhs.translation);
        return new Transformation2(scaling, translation);
    }
}
