/**
 * Created by tianrui on 4/2/14.
 */
public class APoint implements Point {

    private int location;

    public APoint(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    @Override
    public int distance(Point p) {
        return Math.abs(((APoint) p).getLocation() - getLocation());
    }
}
