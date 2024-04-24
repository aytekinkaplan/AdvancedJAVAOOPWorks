package work009Test;

import com.oopworks.work010.ArrayRotations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayRotationsTest {
    // Define a test method for the rotateArray method in ArrayRotations
    @Test
    public void testRotateArray() {
        // Define a test array
        int[] array = {1, 2, 3, 4, 5};
        // Define the number of rotations
        int k = 2;
        // Call the rotateArray method with the test array and number of rotations
        ArrayRotations.rotateArray(array, k);
        // Define the expected rotated array
        int[] expectedRotatedArray = {4, 5, 1, 2, 3};
        // Assert that rotateArray correctly rotates the array
        Assert.assertArrayEquals(expectedRotatedArray, array);
    }
}
