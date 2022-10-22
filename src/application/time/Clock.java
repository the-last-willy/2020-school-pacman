package application.time;

public
class Clock {
    
    public
    Clock() {
        reference = System.nanoTime();
    }

    public
    Duration restart() {
        var previous = reference;
        reference = System.nanoTime();
        return new Duration(reference - previous);
    }

    private
    long reference;
}
