package Dancee;// Represents a foot, used for displaying walking creatures.

import java.awt.*;

public class Foot {
    private Image picture;
    private CoordinateSystem coordinates;

    // Constructor
    public Foot(int x, int y, Image pic) {
        picture = pic;
        coordinates = new CoordinateSystem(x, y, pic);
    }

    // Moves this foot forward by distance pixels
    // (or backward if distance < 0).
    public void moveForward(int distance) {
        coordinates.shift(distance, 0);
    }

    // Moves this foot sideways by distance pixels
    // (to the right if distance  > 0 or to the left
    // if distance < 0).
    public void moveSideways(int distance) {
        coordinates.shift(0, distance);
    }

    // Turns this foot (clockwise for degrees > 0).
    public void turn(int degrees) {
        coordinates.rotate(Math.PI * degrees / 180.0);
    }

    // Draws this foot in the appropriate coordinate system.
    public void draw(Graphics g) {
        coordinates.drawImage(g, picture);
    }
}

