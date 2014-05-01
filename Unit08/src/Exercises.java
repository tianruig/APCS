/**
 * Name: Tianrui
 * Date: 3/7/14
 * Period: 5
 * Project:
 * Description:
 */
public class Exercises {
    public static void main(String[] args) {
//        Quadrilateral q1 = new Quadrilateral(2, 3, 4, 5);
////        q1.printDimensions();
////        System.out.println("Perimeter is: " + q1.getPerimeter());
//
//        Rectangle r1 = new Rectangle(3, 5);
////        r1.printDimensions();
////        System.out.println("Perimeter is: " + r1.getPerimeter());
//
//        Square s1 = new Square(5);
//        System.out.println(s1.getDiagonal());
//
//        ArrayList<Quadrilateral> arrayList = new ArrayList<>();
//        arrayList.add(q1);
//        arrayList.add(r1);
//        arrayList.add(s1);
//
//        for (Quadrilateral quadrilateral : arrayList) {
//            quadrilateral.printDimensions();
//        }


//        Senior s1 = new Senior("John", 1234, 3.2, true);
//        Senior s2 = new Senior("Jane", 12345, 3.1, true);
//        Junior j1 = new Junior("Bob", 9876, 3.9);
//        Junior j2 = new Junior("Michelle", 2435, 3);
//
//        s1.setPostGradPlan("Blah");
//        j1.changeOffCampusPass();
//
//        ArrayList<Student> student = new ArrayList<>();
//        student.add(s1);
//        student.add(s2);
//        student.add(j1);
//        student.add(j2);
//
//        for (Student s : student) {
//            System.out.println(s.getName() + " is a " + s.getYear() + ".");
//        }

        Haiku h = new Haiku();
        h.printRhythm();

        Limeric l = new Limeric();
        l.printRhythm();


        EquilateralTriangle equilateralTr = new EquilateralTriangle(12);
        RightTriangle rightTr = new RightTriangle(12);
        System.out.println("Equilateral " + equilateralTr.getRatio());
        System.out.println("Right isosceles " + rightTr.getRatio());
    }
}
