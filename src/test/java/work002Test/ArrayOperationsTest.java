package work002Test;

import com.oopworks.work002.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTest {
    @Test
    public void testFindMax() {
        // Define an array to test the findMax method
        int[] array = {3, 5, 9, 1, 6};
        // Call the findMax method with the test array and store the result
        int result = ArrayOperations.findMax(array);
        // Assert that the result is as expected (9 in this case)
        Assert.assertEquals(9, result); // This assertion will pass if the findMax method is correct
    }
}
