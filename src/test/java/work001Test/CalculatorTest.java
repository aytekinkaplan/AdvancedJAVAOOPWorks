package work001Test;

import com.oopworks.work001.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.add(1, 2);

        // Then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.subtract(1, 2);

        // Then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.multiply(1, 2);

        // Then
        Assert.assertEquals(2, result); // 1 * 2 = 2
    }

    @Test
    public void testDivide() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.divide(1, 2);

        // Then
        Assert.assertEquals(0, result); // 1 / 2 = 0
    }
    //In these test cases, we follow the principles of unit testing:
    //
    //Isolation: Each test method (testAdd and testSubtract) is independent of others.
    // They test specific functionalities of the Calculator class. This is what you
    // want to do, test each case systematically and separately.

    //Repeatability: These tests can be run multiple times, and they will produce the same results,
    // ensuring consistent behavior of the methods being tested.

    //Simplicity: The tests are straightforward and focused solely on the method
    // they are meant to test. For instance, testAdd only tests the add method.
}
