package Dancee;
public class DanceStep {
    private int initialTurnL, forwardDistanceL, sidewaysDistanceL, finalTurnL,
            initialTurnR, forwardDistanceR, sidewaysDistanceR, finalTurnR;

    public DanceStep(int t1L, int dxL, int dyL, int t2L,
                     int t1R, int dxR, int dyR, int t2R) {
        initialTurnL = t1L;
        forwardDistanceL = dxL;
        sidewaysDistanceL = dyL;
        finalTurnL = t2L;

        initialTurnR = t1R;
        forwardDistanceR = dxR;
        sidewaysDistanceR = dyR;
        finalTurnR = t2R;
    }

    public int getInitialTurnL() {
        return initialTurnL;
    }

    public int getForwardDistanceL() {
        return forwardDistanceL;
    }

    public int getSidewaysDistanceL() {
        return sidewaysDistanceL;
    }

    public int getFinalTurnL() {
        return finalTurnL;
    }

    public int getInitialTurnR() {
        return initialTurnR;
    }

    public int getForwardDistanceR() {
        return forwardDistanceR;
    }

    public int getSidewaysDistanceR() {
        return sidewaysDistanceR;
    }

    public int getFinalTurnR() {
        return finalTurnR;
    }

    public String toString() {
        return "[" +
                initialTurnL + ", " + forwardDistanceL + ", " +
                sidewaysDistanceL + ", " + finalTurnL +
                initialTurnR + ", " + forwardDistanceR + ", " +
                sidewaysDistanceR + ", " + finalTurnR +
                "]";
    }
}
