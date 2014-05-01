public abstract class Triangle {
    protected double side;

    public Triangle(double a) {
        side = a;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public double getRatio() {
        return getArea() / getPerimeter();
    }
}  
