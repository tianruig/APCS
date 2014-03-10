/**
 * Name: Tianrui
 * Date: 3/6/14
 * Period: 5
 * Project:
 * Description:
 */
public class QuadraticFunction implements Comparable<QuadraticFunction> {
    private int a, b, c;

    public QuadraticFunction(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double valueAt(double x) {
        return (a * x * x) + (b * a) + c;
    }

    @Override
    public String toString() {
        String s = a + "x^2";
        s += b > 0 ? "+" + b + "x" : b + "x";
        s += c > 0 ? "+" + c : c;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof QuadraticFunction) {
            return compareTo((QuadraticFunction) o) == 0;
        }
        return false;
    }

    @Override
    public int compareTo(QuadraticFunction o) {
        return a != o.a
                ? a - o.a
                : (b != o.b ? b - o.b : c - o.c);
    }
}
