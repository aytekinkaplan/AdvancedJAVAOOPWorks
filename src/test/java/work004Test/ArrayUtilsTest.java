package work004Test;

import com.oopworks.work004.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {
    @Test
    public void testFindMax() throws Exception {
        int[] array = {3, 5, 9, 1, 6};
        int result = ArrayUtils.findMaximum(array);
        Assert.assertEquals(9, result);
    }

    @Test
    public void testFindMin() throws Exception {
        int[] array = {3, 5, 9, 1, 6};
        int result = ArrayUtils.findMinimum(array);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testFindAvg() throws Exception {
        int[] array = {3, 5, 9, 1, 6};
        int result = ArrayUtils.findAverage(array);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testFindSum() throws Exception {
        int[] array = {3, 5, 9, 1, 6};
        int result = ArrayUtils.findSum(array);
        Assert.assertEquals(23, result);
    }

    @Test
    public void testFindSum2() throws Exception {
        int[] array = {};
        int result = ArrayUtils.findSum(array);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testFindSum3() throws Exception {
        int[] array = {3, 5, 9, 1, 6};
        int result = ArrayUtils.findSum(array);
        Assert.assertEquals(23, result);
    }
}
