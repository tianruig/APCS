package Dancee;// A wrapper class for Dance: reverses the steps

public class ReversedDance implements Dance {
    private Dance dance;

    public ReversedDance(Dance d) {
        dance = d;
    }

    public DanceStep getStep(int i) {
        DanceStep step = dance.getStep(i);
        if (step == null)
            return null;
        else
            return new DanceStep(
                    -step.getInitialTurnR(),
                    -step.getForwardDistanceR(),
                    -step.getSidewaysDistanceR(),
                    -step.getFinalTurnR(),
                    -step.getInitialTurnL(),
                    -step.getForwardDistanceL(),
                    -step.getSidewaysDistanceL(),
                    -step.getFinalTurnL());
    }

    public int getTempo() {
        return dance.getTempo();
    }

    public int getBeat(int i) {
        return dance.getBeat(i);
    }
}
