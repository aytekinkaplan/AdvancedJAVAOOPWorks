package work001Test;

import com.oopworks.work001.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(1, 2);
        Assert.assertEquals(2, result); // 1 * 2 = 2
        // 2 * 2 = 4
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(1, 2);
        Assert.assertEquals(0, result); // 1 / 2 = 0

    }
}
