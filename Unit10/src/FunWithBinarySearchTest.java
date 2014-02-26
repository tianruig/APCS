import junit.framework.Assert;
import org.junit.Test;

public class FunWithBinarySearchTest {

    private final FunWithBinarySearch fwbs = new FunWithBinarySearch();

    @Test
    public void testFind1() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 1), 0);
    }

    @Test
    public void testFind2() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 3), 1);
    }

    @Test
    public void testFind3() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 5), 2);
    }

    @Test
    public void testFind4() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 7), 3);
    }

    @Test
    public void testFind5() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 9), 4);
    }

    @Test
    public void testFind6() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 15), -1);
    }

    @Test
    public void testFind7() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, -1), -1);
    }

    @Test
    public void testFind8() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 2), -1);
    }

    @Test
    public void testFind9() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 4), -1);
    }

    @Test
    public void testFind10() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 6), -1);
    }

    @Test
    public void testFind11() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9}, 8), -1);
    }

    @Test
    public void testFind12() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9, 11}, 6), -1);
    }

    @Test
    public void testFind13() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9, 11}, 5), 2);
    }

    @Test
    public void testFind14() throws Exception {
        Assert.assertEquals(fwbs.find(new int[]{1, 3, 5, 7, 9, 11}, 7), 3);
    }


}
