package Dancee;

public class Rumba extends AbstractDance {

    private static DanceStep[] steps =
            {
                    new DanceStep(0, 50, 0, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 50, 40, 0),
                    new DanceStep(0, 0, 40, 0, 0, 0, 0, 0),

                    new DanceStep(0, 0, 0, 0, 0, -50, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, 0, 0),
                    new DanceStep(0, -50, -40, 0, 0, 0, 0, 0),
                    new DanceStep(0, 0, 0, 0, 0, 0, -40, 0),
            };

    private static int[] rhythm = {1, 2, 1, 1};

    public Rumba() {
        super(steps, rhythm);
    }

    public String getName() {
        return "Dancee.Rumba";
    }

    public int getTempo() {
        return 800;
    }
}
