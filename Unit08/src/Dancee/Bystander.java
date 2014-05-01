package Dancee;

import java.awt.*;

/**
 * Name: Tianrui
 * Date: 4/7/2014
 * Period: 5
 * Project:
 * Description:
 */
public class Bystander extends Biped {

    private int tapsCount;

    public Bystander(int x, int y, Image leftPic, Image rightPic) {
        super(x, y, leftPic, rightPic);
        tapsCount = 0;
    }

    @Override
    public void firstStep() {
        getLeftFoot().turn(-45);
        tapsCount++;
    }

    @Override
    public void nextStep() {
        if (tapsCount % 2 == 0) {
            getLeftFoot().turn(-90);
        } else {
            getLeftFoot().turn(90);
        }
    }

    @Override
    public void stop() {
        if (tapsCount % 2 == 0) {
            getLeftFoot().turn(45);
        } else {
            getLeftFoot().turn(-45);
        }
    }

    @Override
    public int distanceTraveled() {
        return 0;
    }
}
