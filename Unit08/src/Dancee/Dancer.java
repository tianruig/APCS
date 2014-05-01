package Dancee;// Represents a dancer in the Dance Studio project.

import java.awt.*;

public class Dancer extends Biped {
    private Dance currentDance;
    private int stepsCount;

    // Constructor
    public Dancer(int x, int y, Image leftPic, Image rightPic) {
        super(x, y, leftPic, rightPic);
    }

    // Makes this dancer learn dance
    public void learn(Dance dance) {
        currentDance = dance;
    }

    // Makes first step
    public void firstStep() {
        stepsCount = 0;
        nextStep();  // the first step is the same as next step
    }

    // Makes next step
    public void nextStep() {
        Foot lf = getLeftFoot();
        Foot rf = getRightFoot();

        DanceStep step = currentDance.getStep(stepsCount);
        if (step != null)  // null means do not move
        {
            lf.turn(step.getInitialTurnL());
            lf.moveForward(step.getForwardDistanceL());
            lf.moveSideways(step.getSidewaysDistanceL());
            lf.turn(step.getFinalTurnL());

            rf.turn(step.getInitialTurnR());
            rf.moveForward(step.getForwardDistanceR());
            rf.moveSideways(step.getSidewaysDistanceR());
            rf.turn(step.getFinalTurnR());
        }

        stepsCount++;
    }

    // Stops this Dancee.Dancer
    public void stop() {
        // do nothing
    }

    // Returns the distance traveled
    public int distanceTraveled() {
        return 0;
    }
}
