import java.util.ArrayList;

/**
 * Name: Tianrui
 * Date: 3/7/14
 * Period: 5
 * Project:
 * Description:
 */
public class Exercises {
    public static void main(String[] args) {
        Quadrilateral q1 = new Quadrilateral(2, 3, 4, 5);
//        q1.printDimensions();
//        System.out.println("Perimeter is: " + q1.getPerimeter());

        Rectangle r1 = new Rectangle(3, 5);
//        r1.printDimensions();
//        System.out.println("Perimeter is: " + r1.getPerimeter());

        Square s1 = new Square(5);
        System.out.println(s1.getDiagonal());

        ArrayList<Quadrilateral> arrayList = new ArrayList<>();
        arrayList.add(q1);
        arrayList.add(r1);
        arrayList.add(s1);

        for (Quadrilateral quadrilateral : arrayList) {
            quadrilateral.printDimensions();
        }
    }
}
