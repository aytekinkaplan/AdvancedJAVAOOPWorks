package work007Test;

import com.oopworks.work008.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayOperationsTest {
    @Test
    public void testSumArray() {
        // TODO: Write a test for the sumArray method in ArrayOperations
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertEquals(Arrays.stream(numbers).reduce(0, Integer::sum), ArrayOperations.sumArray(numbers));
    }
}
