package numeric;

public
class Fraction {
    public
    Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public
    Fraction(Fraction cpy) {
        numerator = cpy.numerator;
        denominator = cpy.denominator;
    }

    public
    int getNumerator() {
        return numerator;
    }

    public
    int getDenominator() {
        return denominator;
    }

    public static final
    Fraction ONE = new Fraction(1);

    private final
    int numerator, denominator;
}
