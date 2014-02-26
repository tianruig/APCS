import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FunWithInsertionSortTest {
    @Test
    public void testSort() throws Exception {
        int arr[] = {9, 8, 5, 4, 3, 2};
        FunWithInsertionSort f = new FunWithInsertionSort(arr);

        f.sort();
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, f.getList());
    }

    @Test
    public void testSort2() throws Exception {
        int arr[] = {1, 1, 1, 1, 5, 5, 5, 1};
        FunWithInsertionSort f = new FunWithInsertionSort(arr);

        f.sort();
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, f.getList());
    }

    @Test
    public void testSort3() throws Exception {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        FunWithInsertionSort f = new FunWithInsertionSort(arr);

        f.sort();
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, f.getList());
    }
}
