public class MagicSquareTest3 extends junit.framework.TestCase {
    public void test1() {
        MagicSquare test1 = new MagicSquare();
        int[][] x = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        assertEquals(true, test1.isMagicSquare(x));
    }

    public void test2() {
        MagicSquare test2 = new MagicSquare();
        int[][] x = {{1, 2, 3}, {3, 2, 1}};
        assertEquals(false, test2.isMagicSquare(x));
    }

    public void test3() {
        MagicSquare test3 = new MagicSquare();
        int[][] x = {{1, 8, 12, 13}, {14, 11, 7, 2}, {15, 10, 6, 3}, {4, 5, 9, 16}};
        assertEquals(true, test3.isMagicSquare(x));
    }

    public void test4() {
        MagicSquare test4 = new MagicSquare();
        int[][] x = {{6, 1, 8}, {7, 5, 3}, {2, 9, 3}};
        assertEquals(false, test4.isMagicSquare(x));
    }


}
