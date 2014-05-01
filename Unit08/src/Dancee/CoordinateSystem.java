package Dancee;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class CoordinateSystem {
    private Image picture;
    private AffineTransform coordTransform;

    //  0 degrees points east
    public CoordinateSystem(int x, int y, Image pic) {
        picture = pic;
        coordTransform = new AffineTransform();

        int w = picture.getWidth(null) / 2;
        int h = picture.getHeight(null) / 2;
        coordTransform.translate(x - w, y - h);
    }

    public void shift(double dx, double dy) {
        coordTransform.translate(dx, dy);
    }

    public void rotate(double radians) {
        int w = picture.getWidth(null);
        int h = picture.getHeight(null);
        coordTransform.rotate(radians, w / 2, h / 2);
    }

    public void drawImage(Graphics g, Image picture) {
        ((Graphics2D) g).drawImage(picture, coordTransform, null);
    }
}

