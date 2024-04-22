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
}
