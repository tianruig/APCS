package Dancee;// This abstract class represents a two-legged creature.

import java.awt.*;

public abstract class Biped {
    public static final int PIXELS_PER_INCH = 6;
    private Foot leftFoot;
    private Foot rightFoot;

    // Constructor
    public Biped(int x, int y, Image leftPic, Image rightPic) {
        leftFoot = new Foot(x, y - PIXELS_PER_INCH * 4, leftPic);
        rightFoot = new Foot(x, y + PIXELS_PER_INCH * 4, rightPic);
    }

    // Returns the left foot
    public Foot getLeftFoot() {
        return leftFoot;
    }

    // Returns the right foot
    public Foot getRightFoot() {
        return rightFoot;
    }

    // Makes first step
    public abstract void firstStep();

    // Makes next step
    public abstract void nextStep();

    // Stops this Dancee.Biped
    public abstract void stop();

    // Returns the distance traveled
    public abstract int distanceTraveled();

    // Turns this Dancee.Biped left 90 degrees
    // Precondition: the left and right feet are side by side
    public void turnLeft() {
        leftFoot.turn(-90);
        rightFoot.turn(-90);
        rightFoot.moveSideways(PIXELS_PER_INCH * 8);
        rightFoot.moveForward(PIXELS_PER_INCH * 8);
    }

    // Turns this Pacer right 90 degrees
    // Precondition: the left and right feet are side by side
    public void turnRight() {
        leftFoot.turn(90);
        rightFoot.turn(90);
        leftFoot.moveSideways(-PIXELS_PER_INCH * 8);
        leftFoot.moveForward(PIXELS_PER_INCH * 8);
    }

    // Turns this Byped 180 degrees
    public void turnAround() {
        leftFoot.turn(180);
        rightFoot.turn(180);
        leftFoot.moveSideways(-PIXELS_PER_INCH * 8);
        rightFoot.moveSideways(PIXELS_PER_INCH * 8);
    }

    // Draws this Dancee.Biped
    public void draw(Graphics g) {
        leftFoot.draw(g);
        rightFoot.draw(g);
    }
}
