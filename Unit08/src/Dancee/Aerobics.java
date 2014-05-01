package Dancee;// Represents a free-style dance

public class Aerobics implements Dance {
    private static DanceStep[] steps =
            {
                    new DanceStep(0, 0, -24, 0, 0, 0, 24, 0),
                    new DanceStep(0, 0, 24, 0, 0, 0, -24, 0)
            };

    public String getName() {
        return "Dancee.Aerobics";
    }

    public DanceStep getStep(int i) {
        return steps[i % steps.length];
    }

    public int getTempo() {
        return 750;
    }

    public int getBeat(int i) {
        return 1;
    }

    public String toString() {
        return getName();
    }

}
