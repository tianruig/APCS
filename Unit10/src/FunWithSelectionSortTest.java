import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FunWithSelectionSortTest {
    @Test
    public void testSort() throws Exception {
        int arr[] = {9, 8, 5, 4, 3, 2};
        FunWithSelectionSort f = new FunWithSelectionSort(arr);

        f.sort();
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, f.getList());
    }

    @Test
    public void testSort2() throws Exception {
        int arr[] = {1, 1, 1, 1, 5, 5, 5, 1};
        FunWithSelectionSort f = new FunWithSelectionSort(arr);

        f.sort();
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, f.getList());
    }

    @Test
    public void testSort3() throws Exception {
        int arr[] = {2, 2, 6, 1, 5, 6, 4};
        FunWithSelectionSort f = new FunWithSelectionSort(arr);

        Assert.assertEquals(3, f.findIndexOfSmallest(0));
        Assert.assertEquals(3, f.findIndexOfSmallest(3));
        Assert.assertEquals(6, f.findIndexOfSmallest(4));

        f.sort();
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, f.getList());
    }

}
