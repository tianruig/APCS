package shape;

/**
 * Name: Tianrui
 * Date: 3/7/14
 * Period: 5
 * Project:
 * Description:
 */
public class Square extends Rectangle {

    public Square(int s) {
        super(s, s);
    }

    @Override
    public void printDimensions() {
        super.printDimensions();
        System.out.println("Diagonal is " + getDiagonal());
    }
}
