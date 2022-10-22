package numeric;

public
class Random {

    public static
    int integer(int b) {
        return generator.nextInt(b);
    }

    public static
    int integer(int lb, int ub) {
        return generator.nextInt(ub - lb + 1) + lb;
    }

    private static
    java.util.Random generator = new java.util.Random();
}
