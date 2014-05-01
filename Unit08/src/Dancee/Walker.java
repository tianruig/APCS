package Dancee;
// Represents a Biped that moves alternating the left and right foot

import java.awt.*;

public class Walker extends Biped {
    private int stepLength;
    private int stepsCount;

    // Constructor
    public Walker(int x, int y, Image leftPic, Image rightPic) {
        super(x, y, leftPic, rightPic);  // must be the first statement
        stepLength = PIXELS_PER_INCH * 12;
    }

    // Makes first step, starting with the left foot
    public void firstStep() {
        getLeftFoot().moveForward(stepLength);
        stepsCount = 1;
    }

    // Makes next step
    public void nextStep() {
        if (stepsCount % 2 == 0)  // if stepsCount is even
            getLeftFoot().moveForward(2 * stepLength);
        else
            getRightFoot().moveForward(2 * stepLength);

        stepsCount++;
    }

    // Stops this walker (brings its feet together)
    public void stop() {
        if (stepsCount % 2 == 0)  // if stepsCount is even
            getLeftFoot().moveForward(stepLength);
        else
            getRightFoot().moveForward(stepLength);
    }

    // Returns the distance walked
    public int distanceTraveled() {
        return stepsCount * stepLength;
    }
}
