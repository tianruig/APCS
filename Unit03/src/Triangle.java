/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: Triangle
 */

public class Triangle {

    private int x1, y1, x2, y2, x3, y3;

    public Triangle(int xCoor1, int yCoor1, int xCoor2, int yCoor2, int xCoor3, int yCoor3) {
        x1 = xCoor1;
        y1 = yCoor1;
        x2 = xCoor2;
        y2 = yCoor2;
        x3 = xCoor3;
        y3 = yCoor3;
    }

    public double lengthOfSide1() {
        return calculateDistance(x1, y1, x2, y2);
    }

    public double lengthOfSide2() {
        return calculateDistance(x1, y1, x3, y3);
    }

    public double lengthOfSide3() {
        return calculateDistance(x2, y2, x3, y3);
    }

    // Calculates the angle that is formed by side 1 and side 2
    public double angleAt12() {
        return calculateAngle(lengthOfSide1(), lengthOfSide2(), lengthOfSide3());
    }

    // Calculates the angle that is formed by side 1 and side 3
    public double angleAt13() {
        return calculateAngle(lengthOfSide1(), lengthOfSide3(), lengthOfSide2());
    }

    // Calculates the angle that is formed by side 2 and side 3
    public double angleAt23() {
        return calculateAngle(lengthOfSide2(), lengthOfSide3(), lengthOfSide1());
    }

    public double calculatePerimeter() {
        return lengthOfSide1() + lengthOfSide2() + lengthOfSide3();
    }

    public double calculateArea() {
        double s = (calculatePerimeter()) / 2.0;
        return Math.sqrt(s * (s - lengthOfSide1()) * (s - lengthOfSide2()) * (s - lengthOfSide3()));
    }

    // Calculates the distance between the points (x1, y1) and (x2, y2)
    public double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Calculates measure (in degrees) of angle formed between sides a and b (aka the angle opposite side c).
    public double calculateAngle(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
    }
}
