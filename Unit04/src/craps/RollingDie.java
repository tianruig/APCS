package craps;

// Implements a rolling die object.

import java.awt.*;

public class RollingDie extends Die {

    private static final double slowdown = 0.97,
            speedFactor = 0.04,
            speedLimit = 2.0;
    private static int tableLeft, tableRight, tableTop, tableBottom;
    private final int dieSize = 24;
    private int xCenter, yCenter;
    private double xSpeed, ySpeed;

    // sets the "table" boundaries
    public static void setBounds(int left, int right, int top, int bottom) {
        tableLeft = left;
        tableRight = right;
        tableTop = top;
        tableBottom = bottom;
    }

    // Constructor: sets this die "off the table"
    public RollingDie() {
        xCenter = -1;
        yCenter = -1;
    }

    // Starts this die rolling
    public void roll() {
        super.roll();
        int width = tableRight - tableLeft;
        int height = tableBottom - tableTop;
        xCenter = tableLeft;
        yCenter = tableTop + height / 2;
        xSpeed = width * (Math.random() + 1) * speedFactor;
        ySpeed = height * (Math.random() - .5) * 2. * speedFactor;
    }

    // Returns true if this die is rolling; otherwise
    // returns false
    public boolean isRolling() {
        return xSpeed > speedLimit || xSpeed < -speedLimit
                || ySpeed > speedLimit || ySpeed < -speedLimit;
    }

    // Keeps moving this die as long as it overlaps
    // with other
    public void avoidCollision(RollingDie other) {
        if (other == this) {
            return;
        }

        while (Math.abs(xCenter - other.xCenter) < dieSize
                && Math.abs(yCenter - other.yCenter) < dieSize) {
            move();
        }
    }

    // Moves this die on the "table," bouncing
    // off the edges when necessary
    private void move() {
        xCenter += xSpeed;
        yCenter += ySpeed;

        int radius = dieSize / 2;

        if (xCenter < tableLeft + radius) {
            xCenter = tableLeft + radius;
            xSpeed = -xSpeed;
        }

        if (xCenter > tableRight - radius) {
            xCenter = tableRight - radius;
            xSpeed = -xSpeed;
        }

        if (yCenter < tableTop + radius) {
            yCenter = tableTop + radius;
            ySpeed = -ySpeed;
        }

        if (yCenter > tableBottom - radius) {
            yCenter = tableBottom - radius;
            ySpeed = -ySpeed;
        }
    }

    // Draws this die, rolling or stopped;
    // also moves this die, when rolling
    public void draw(Graphics g) {
        if (xCenter < 0 || yCenter < 0) {
            return;
        } else if (isRolling()) {
            move();
            drawRolling(g);
            xSpeed *= slowdown;
            ySpeed *= slowdown;
        } else {
            drawStopped(g);
        }
    }

    // Draws this die when rolling with a random number of dots
    private void drawRolling(Graphics g) {
        int x = xCenter - dieSize / 2 + (int) (3 * Math.random()) - 1;
        int y = yCenter - dieSize / 2 + (int) (3 * Math.random()) - 1;
        g.setColor(Color.RED);

        if (x % 2 != 0) {
            g.fillRoundRect(x, y, dieSize, dieSize, dieSize / 4, dieSize / 4);
        } else {
            g.fillOval(x - 2, y - 2, dieSize + 4, dieSize + 4);
        }

        Die die = new Die();
        die.roll();
        drawDots(g, x, y, die.getNumDots());
    }

    // Draws this die when stopped
    private void drawStopped(Graphics g) {
        int x = xCenter - dieSize / 2;
        int y = yCenter - dieSize / 2;
        g.setColor(Color.RED);
        g.fillRoundRect(x, y, dieSize, dieSize, dieSize / 4, dieSize / 4);
        drawDots(g, x, y, getNumDots());
    }

    // Draws a given number of dots on this die
    private void drawDots(Graphics g, int x, int y, int numDots) {
        g.setColor(Color.WHITE);

        int dotSize = dieSize / 4;
        int step = dieSize / 8;
        int x1 = x + step - 1;
        int x2 = x + 3 * step;
        int x3 = x + 5 * step + 1;
        int y1 = y + step - 1;
        int y2 = y + 3 * step;
        int y3 = y + 5 * step + 1;

        switch (numDots) {
            case 1:
                g.fillOval(x2, y2, dotSize, dotSize);
                break;
            case 2:
                g.fillOval(x1, y1, dotSize, dotSize);
                g.fillOval(x3, y3, dotSize, dotSize);
                break;
            case 3:
                g.fillOval(x1, y1, dotSize, dotSize);
                g.fillOval(x2, y2, dotSize, dotSize);
                g.fillOval(x3, y3, dotSize, dotSize);
                break;
            case 4:
                g.fillOval(x1, y1, dotSize, dotSize);
                g.fillOval(x1, y3, dotSize, dotSize);
                g.fillOval(x3, y1, dotSize, dotSize);
                g.fillOval(x3, y3, dotSize, dotSize);
                break;
            case 5:
                g.fillOval(x1, y1, dotSize, dotSize);
                g.fillOval(x1, y3, dotSize, dotSize);
                g.fillOval(x3, y1, dotSize, dotSize);
                g.fillOval(x3, y3, dotSize, dotSize);
                g.fillOval(x2, y2, dotSize, dotSize);
                break;
            default:
                g.fillOval(x1, y1, dotSize, dotSize);
                g.fillOval(x1, y2, dotSize, dotSize);
                g.fillOval(x1, y3, dotSize, dotSize);
                g.fillOval(x3, y1, dotSize, dotSize);
                g.fillOval(x3, y2, dotSize, dotSize);
                g.fillOval(x3, y3, dotSize, dotSize);
        }
    }
}
