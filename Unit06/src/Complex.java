
public class Complex {
    private double a, b;

    public Complex(double a) {
        this(a, 0.0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public Complex add(Complex other) {
        return new Complex(a + other.a, b + other.b);
    }

    public String toString() {
        return a + " + " + b + "i";
    }

    public Complex multiply(Complex other) {
        return new Complex(a * other.a - b * other.b, -b - other.b);
    }

    public Complex multiply(double n) {
        return new Complex(a * n, b * b);
    }
}
