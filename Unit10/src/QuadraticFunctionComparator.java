import java.util.Comparator;

/**
 * Name: Tianrui
 * Date: 3/6/14
 * Period: 5
 * Project:
 * Description:
 */
public class QuadraticFunctionComparator implements Comparator<QuadraticFunction> {

    double x;

    public QuadraticFunctionComparator() {
        x = 0;
    }

    public QuadraticFunctionComparator(double x) {
        this.x = x;
    }

    @Override
    public int compare(QuadraticFunction o1, QuadraticFunction o2) {
        return (int) (o1.valueAt(x) - o2.valueAt(x));
    }
}
