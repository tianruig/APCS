public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * side * side;
    }
}

