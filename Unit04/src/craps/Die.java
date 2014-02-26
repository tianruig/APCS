package craps;

public class Die {

    private int numDots, sides;

    public Die() {
        sides = 6;
    }

    public Die(int s) {
        sides = s;
    }

    public void roll() {
        numDots = (int) (Math.random() * sides) + 1;
    }

    public int getNumDots() {
        return numDots;
    }
}
