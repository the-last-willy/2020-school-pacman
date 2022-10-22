package numeric;

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
    Fraction getScaling() {
        return scaling;
    }

    public
    Vector2 getTranslation() {
        return translation;
    }

    public static final
    Transformation2 IDENTITY = new Transformation2(Fraction.ONE, Vector2.NULL);

    private final
    Fraction scaling;

    private final
    Vector2 translation;
}
