package model;

public
class Score {

    public
    Score() {
        this.multiplier = 1;
        this.value = 0;
    }

    public
    Score eatGhost() {
        value += multiplier * 200;
        multiplier *= 2;
        return this;
    }

    public
    Score eatPellet() {
        value += 10;
        return this;
    }

    public
    Score eatPowerPellet() {
        value += 50;
        return this;
    }

    public
    Score resetMultiplier() {
        multiplier = 1;
        return this;
    }

    public
    int getValue() {
        return value;
    }

    private
    int multiplier;

    private
    int value;
}
