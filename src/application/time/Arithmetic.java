package application.time;

public
class Arithmetic {

    public static
    Duration sum(Duration lhs, Duration rhs) {
        return new Duration(lhs.getNanoseconds() + rhs.getNanoseconds());
    }

    public static
    Duration difference(Duration lhs, Duration rhs) {
        return new Duration(lhs.getNanoseconds() - rhs.getNanoseconds());
    }
}
