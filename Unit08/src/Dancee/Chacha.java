package Dancee;

public class Chacha extends AbstractDance {
    private static DanceStep[] steps =
            {
                    new DanceStep(0, 50, 0, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, 0, -6),
                    new DanceStep(0, 0, 0, 0, 0, 0, 0, 6),
                    new DanceStep(0, 0, 0, -6, 0, 0, 0, 0),
                    new DanceStep(6, -50, -40, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, -50, 0),
                    new DanceStep(0, 0, -10, 0, 0, 0, 0, 0),
                    null,

                    new DanceStep(0, 0, 0, 0, 0, -50, 0, 0),
                    new DanceStep(0, 0, 0, 6, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, -6, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, 0, 6),
                    new DanceStep(0, 0, 0, 0, -6, 50, 40, 0),
                    new DanceStep(0, 0, 50, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, 10, 0),
                    null,
            };

    private static int[] rhythm = {1, 2, 1, 2, 1, 1, 1, 2};

    public Chacha() {
        super(steps, rhythm);
    }

    public String getName() {
        return "Cha Cha";
    }

    public int getTempo() {
        return 500;
    }
}