/**
 * Name: Tianrui
 * Date: 3/7/14
 * Period: 5
 * Project: In-Class Exercise
 * Description:
 */

public class Quadrilateral {
    private int side1, side2, side3, side4;

    public Quadrilateral(int side1, int side2, int side3, int side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public int getAngleSum() {
        return 360;
    }

    public int getPerimeter() {
        return side1 + side2 + side3 + side4;
    }

    public void printDimensions() {
        System.out.println(side1 + ", " + side2 + ", " + side3 + ", " + side4);
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public int getSide4() {
        return side4;
    }
}
