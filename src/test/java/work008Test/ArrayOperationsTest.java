package work008Test;

import com.oopworks.work008.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTest {
    @Test
    public void testSumArray() {
        // Define a test array
        int[] numbers = {1, 2, 3, 4};
        // Define the expected sum of the array elements
        int expectedSum = 10;
        // Assert that the sumArray method returns the correct sum
        Assert.assertEquals(expectedSum, ArrayOperations.sumArray(numbers));
    }
}
