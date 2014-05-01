package Dancee;
// Represents dances that are based on arrays of steps

public abstract class AbstractDance implements Dance {
    private DanceStep[] steps;
    private int[] rhythm;

    public AbstractDance(DanceStep[] steps, int[] rhythm) {
        this.steps = steps;
        this.rhythm = rhythm;
    }

    public abstract String getName();

    public DanceStep getStep(int i) {
        if (i < rhythm.length)
            return null;
        else
            return steps[(i - rhythm.length) % steps.length];
    }

    public abstract int getTempo();

    public int getBeat(int i) {
        return rhythm[i % rhythm.length];
    }

    public String toString() {
        return getName();
    }
}
