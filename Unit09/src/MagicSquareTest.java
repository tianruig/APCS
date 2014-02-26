import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MagicSquareTest {
    @Test
    public void testIsMagicSquare1() throws Exception {
        int array[][] = {{16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}};

        assertTrue(MagicSquare.isMagicSquare(array));
    }

    @Test
    public void testIsMagicSquare2() throws Exception {
        int array[][] = {{16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12}};
        assertFalse(MagicSquare.isMagicSquare(array));

    }

    @Test
    public void testIsMagicSquare3() throws Exception {
        int array[][] = {{16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 15, 1}};
        assertFalse(MagicSquare.isMagicSquare(array));

    }

    @Test
    public void testIsMagicSquare4() throws Exception {
        int array[][] = {{2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}};
        assertTrue(MagicSquare.isMagicSquare(array));

    }

    @Test
    public void testIsMagicSquare5() throws Exception {
        int array[][] = {{2, 7},
                {9, 5, 1},
                {4, 3, 8}};
        assertFalse(MagicSquare.isMagicSquare(array));

    }
}
