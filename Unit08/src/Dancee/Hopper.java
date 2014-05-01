package Dancee;

import java.awt.*;

/**
 * Name: Tianrui
 * Date: 4/7/2014
 * Period: 5
 * Project:
 * Description:
 */
public class Hopper extends Biped {
    protected int distTraveled;

    public Hopper(int x, int y, Image leftPic, Image rightPic) {
        super(x, y, leftPic, rightPic);
        distTraveled = 0;
    }

    @Override
    public void firstStep() {
        nextStep();
    }

    @Override
    public void nextStep() {
        getLeftFoot().moveForward(1);
        getRightFoot().moveForward(1);
        distTraveled++;
    }

    @Override
    public void stop() {
    }

    @Override
    public int distanceTraveled() {
        return distTraveled;
    }
}
