package Dancee;

import java.awt.*;

/**
 * Name: Tianrui
 * Date: 4/7/2014
 * Period: 5
 * Project:
 * Description:
 */
public class RandomHopper extends Hopper {
    public RandomHopper(int x, int y, Image leftPic, Image rightPic) {
        super(x, y, leftPic, rightPic);
    }

    @Override
    public void nextStep() {
        super.nextStep();
        int n = (int) (Math.random() * 3);
        if (n == 0) {
            turnAround();
        } else if (n == 2) {
            turnLeft();
        } else {
            turnRight();
        }
    }
}
