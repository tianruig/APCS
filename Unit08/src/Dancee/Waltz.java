package Dancee;

public class Waltz extends AbstractDance {
    private static DanceStep[] steps =
            {
                    new DanceStep(0, 50, 0, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 50, 40, 0),
                    new DanceStep(0, 0, 40, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, -50, 0, 0),
                    new DanceStep(0, -50, -40, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, -40, 0)
            };

    private static int[] rhythm = {1, 2, 2, 1, 2, 2};

    public Waltz() {
        super(steps, rhythm);
    }

    public String getName() {
        return "Dancee.Waltz";
    }

    public int getTempo() {
        return 700;
    }
}
