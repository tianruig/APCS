import org.junit.Assert;
import org.junit.Test;

public class SortSearchTest {
    @Test
    public void test1() throws Exception {
        FunWithSelectionSort test = new FunWithSelectionSort(new int[]{5, 1, 2});
//        FunWithSelectionSort test = new FunWithSelectionSort(new int[]{5, 4, 6, 3, 7, 2, 8, 1, 9});
        test.sort();
        Assert.assertArrayEquals(new int[]{1, 2, 5}, test.getList());
    }

    @Test
    public void test2() throws Exception {
        FunWithInsertionSort test = new FunWithInsertionSort(new int[]{5, 4, 6, 3, 7, 2, 8, 1, 9});
        test.sort();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, test.getList());

    }

    @Test
    public void test3() throws Exception {
        FunWithBinarySearch test = new FunWithBinarySearch();
        Assert.assertEquals(0, test.find(new int[]{1, 2, 3, 4, 5}, 1));
        Assert.assertEquals(1, test.find(new int[]{1, 2, 3, 4, 5}, 2));
        Assert.assertEquals(2, test.find(new int[]{1, 2, 3, 4, 5}, 3));
        Assert.assertEquals(3, test.find(new int[]{1, 2, 3, 4, 5}, 4));
        Assert.assertEquals(4, test.find(new int[]{1, 2, 3, 4, 5}, 5));

        Assert.assertEquals(-1, test.find(new int[]{1, 2, 3, 4, 5}, -100));
        Assert.assertEquals(-1, test.find(new int[]{1, 2, 3, 4, 5}, 0));
        Assert.assertEquals(-1, test.find(new int[]{1, 2, 3, 4, 5}, 7));
        Assert.assertEquals(-1, test.find(new int[]{1, 2, 3, 4, 5}, 6));

    }

    @Test
    public void test4() throws Exception {
        FunWithBinarySearch test = new FunWithBinarySearch();
        Assert.assertEquals(0, test.find(new int[]{2, 4, 6, 8}, 2));
        Assert.assertEquals(1, test.find(new int[]{2, 4, 6, 8}, 4));
        Assert.assertEquals(2, test.find(new int[]{2, 4, 6, 8}, 6));
        Assert.assertEquals(3, test.find(new int[]{2, 4, 6, 8}, 8));

        Assert.assertEquals(-1, test.find(new int[]{2, 4, 6, 8}, 1));
        Assert.assertEquals(-1, test.find(new int[]{2, 4, 6, 8}, 3));
        Assert.assertEquals(-1, test.find(new int[]{2, 4, 6, 8}, 5));
        Assert.assertEquals(-1, test.find(new int[]{2, 4, 6, 8}, 7));
        Assert.assertEquals(-1, test.find(new int[]{2, 4, 6, 8}, 9));

    }

}
