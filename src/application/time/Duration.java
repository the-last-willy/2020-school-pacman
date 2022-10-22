package application.time;

public
class Duration {

    public
    Duration(long nanoseconds) {
        this.nanoseconds = nanoseconds;
    }

    public
    Duration(Duration cpy) {
        this.nanoseconds = cpy.nanoseconds;
    }

    public
    long getNanoseconds() {
        return nanoseconds;
    }

    public
    float asSeconds() {
        return (float) nanoseconds / BILLION;
    }

    public
    int compareTo(Duration rhs) {
        boolean inf = nanoseconds < rhs.nanoseconds;
        boolean sup = nanoseconds > rhs.nanoseconds;
        return (sup ? 1 : 0) - (inf ? 1 : 0);
    }

    public static final
    Duration NULL = new Duration(0);

    private final
    long nanoseconds;

    public static
    Duration seconds(float value) {
        long nanoseconds = (long) (BILLION * value);
        return new Duration(nanoseconds);
    }

    public static
    Duration nanoseconds(long value) {
        return new Duration(value); 
    }

    private static final
    long BILLION = 1000000000;
}
