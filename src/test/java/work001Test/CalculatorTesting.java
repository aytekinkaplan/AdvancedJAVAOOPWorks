package work001Test;// Import the necessary classes for testing
import com.oopworks.work001.Calculator;
import org.junit.Assert;
import org.junit.Test;

// Define a test class for Calculator
public class CalculatorTesting {
    // Define a test method for the add method in Calculator
    @Test
    public void testAddition() {
        // Create a new Calculator object
        Calculator calc = new Calculator();
        // Assert that the add method returns the correct result
        Assert.assertEquals(5, calc.add(2, 3));
    }

    // Define a test method for the subtract method in Calculator
    @Test
    public void testSubtraction() {
        // Create a new Calculator object
        Calculator calc = new Calculator();
        // Assert that the subtract method returns the correct result
        Assert.assertEquals(1, calc.subtract(4, 3));
    }
}