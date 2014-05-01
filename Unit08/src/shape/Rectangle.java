package shape;

/**
 * Name: Tianrui
 * Date: 3/7/14
 * Period: 5
 * Project:
 * Description:
 */
public class Rectangle extends Quadrilateral {
    private double diagonal;

    public Rectangle(int side1, int side2) {
        super(side1, side1, side2, side2);
        diagonal = calcDiag();
    }

    public double calcDiag() {
        return Math.sqrt(getSide1() * getSide1() + getSide3() * getSide3());
    }

    public double getDiagonal() {
        return diagonal;
    }

    @Override
    public void printDimensions() {
        System.out.println(getSide1() + " x " + getSide3());
    }

}
