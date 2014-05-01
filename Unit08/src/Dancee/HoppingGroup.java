package Dancee;
import javax.swing.*;
import java.awt.*;

public class HoppingGroup implements StudentGroup {
    private Hopper h1;
    private Hopper h2;
    private Image leftMansShoe, rightMansShoe;
    private Image leftWomansShoe, rightWomansShoe;

    private DanceFloor danceFloor;
    private State currentState;

    // Constructor
    public HoppingGroup(DanceFloor df) {
        danceFloor = df;
        leftMansShoe = (new ImageIcon("leftshoe.gif")).getImage();
        rightMansShoe = (new ImageIcon("rightshoe.gif")).getImage();
        leftWomansShoe = (new ImageIcon("leftsandal.gif")).getImage();
        rightWomansShoe = (new ImageIcon("rightsandal.gif")).getImage();
    }

    // Sets up this group of participants
    public void setup(int floorDir, Dance steps1, Dance steps2) {
        int x = danceFloor.getWidth() / 2;
        int y = danceFloor.getHeight() / 2;
        if (floorDir == 0) {
            h1 = new Hopper(x, y + Hopper.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
            h2 = new Hopper(x, y - Hopper.PIXELS_PER_INCH * 12, leftWomansShoe, rightWomansShoe);
            h1.turnLeft();
            h2.turnRight();
        } else {
            h1 = new Hopper(x, y - Hopper.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
            h2 = new Hopper(x, y + Hopper.PIXELS_PER_INCH * 12, leftWomansShoe, rightWomansShoe);
            h1.turnRight();
            h2.turnLeft();
        }
        currentState = State.READY;
        danceFloor.update(this);

        h1.learn(steps1);
        h2.learn(steps2);
    }

    // Moves the group by one step
    public void makeNextStep() {
        if (currentState == State.READY) {
            h1.firstStep();
            h2.firstStep();
            currentState = State.MOVING;
        } else if (currentState == State.MOVING) {
            h1.nextStep();
            h2.nextStep();
        } else if (currentState == State.STOPPED) // never happens
        {
            h1.turnAround();
            h2.turnAround();
            currentState = State.READY;
        }

        danceFloor.update(this);
    }

    // Draws this group
    public void draw(Graphics g) {
        h1.draw(g);
        h2.draw(g);
    }

    private enum State {READY, MOVING, STOPPED}
}
