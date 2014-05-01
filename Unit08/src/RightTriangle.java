public class RightTriangle extends Triangle {

    public RightTriangle(double a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        return (2 + Math.sqrt(2.0)) * side;
    }

    @Override
    public double getArea() {
        return side * side / 2;
    }
}
