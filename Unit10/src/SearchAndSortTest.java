import java.util.Arrays;

public class SearchAndSortTest extends junit.framework.TestCase {

    public void test1() throws Exception {
        FunWithSelectionSort test = new FunWithSelectionSort(new int[]{5, 4, 6, 3, 7, 2, 8, 1, 9});
        test.sort();
        assertEquals(1, test.getList()[0]);
        assertEquals(2, test.getList()[1]);
        assertEquals(3, test.getList()[2]);
        assertEquals(4, test.getList()[3]);
        assertEquals(5, test.getList()[4]);
        assertEquals(6, test.getList()[5]);
        assertEquals(7, test.getList()[6]);
        assertEquals(8, test.getList()[7]);
        assertEquals(9, test.getList()[8]);
    }

    public void test2() throws Exception {
        FunWithSelectionSort test = new FunWithSelectionSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        test.sort();
        assertEquals(1, test.getList()[0]);
        assertEquals(2, test.getList()[1]);
        assertEquals(3, test.getList()[2]);
        assertEquals(4, test.getList()[3]);
        assertEquals(5, test.getList()[4]);
        assertEquals(6, test.getList()[5]);
        assertEquals(7, test.getList()[6]);
        assertEquals(8, test.getList()[7]);
        assertEquals(9, test.getList()[8]);
        assertEquals(10, test.getList()[9]);
    }


    public void test3() throws Exception {
        FunWithInsertionSort test = new FunWithInsertionSort(new int[]{5, 4, 6, 3, 7, 2, 8, 1, 9});
        test.sort();
        assertEquals(1, test.getList()[0]);
        assertEquals(2, test.getList()[1]);
        assertEquals(3, test.getList()[2]);
        assertEquals(4, test.getList()[3]);
        assertEquals(5, test.getList()[4]);
        assertEquals(6, test.getList()[5]);
        assertEquals(7, test.getList()[6]);
        assertEquals(8, test.getList()[7]);
        assertEquals(9, test.getList()[8]);
    }

    public void test4() throws Exception {
        FunWithInsertionSort test = new FunWithInsertionSort(new int[]{5, 4, 3, 2, 1});
        test.sort();
        System.out.println(Arrays.toString(test.getList()));
        assertEquals(1, test.getList()[0]);
        assertEquals(2, test.getList()[1]);
        assertEquals(3, test.getList()[2]);
        assertEquals(4, test.getList()[3]);
        assertEquals(5, test.getList()[4]);

    }

    public void test5() throws Exception {
        FunWithBinarySearch test = new FunWithBinarySearch();
        assertEquals(3, test.find(new int[]{1, 2, 3, 4, 5}, 4));

    }

    public void test6() throws Exception {
        FunWithBinarySearch test = new FunWithBinarySearch();

        assertEquals(-1, test.find(new int[]{1, 2, 3, 4, 5}, 6));
    }

}