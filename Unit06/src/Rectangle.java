
public class Rectangle {

    private int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public Rectangle(int side) {
        this(side, side);
    }

    public Rectangle() {
        this(1, 1);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isSquare() {
        return width == height;
    }

    public void quadratize() {
        width = (int) (Math.sqrt(width * height) + 0.5);
        height = width;
    }
}
