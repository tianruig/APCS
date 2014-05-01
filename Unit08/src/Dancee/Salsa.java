package Dancee;

public class Salsa extends AbstractDance {

    private static DanceStep[] steps =
            {
                    new DanceStep(0, 50, 0, 0, 0, 0, 0, 6),
                    new DanceStep(0, 0, 0, 0, 0, 0, 0, -6),
                    new DanceStep(0, -50, 0, 0, 0, 0, 0, 0),
                    null,
                    new DanceStep(0, 0, 0, -6, 0, -50, 0, 0),
                    new DanceStep(6, 0, 0, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 50, 0, 0),
                    null,
            };

    private static int[] rhythm = {2, 1, 2, 0};

    public Salsa() {
        super(steps, rhythm);
    }

    public String getName() {
        return "Dancee.Salsa";
    }

    public int getTempo() {
        return 400;
    }
}
