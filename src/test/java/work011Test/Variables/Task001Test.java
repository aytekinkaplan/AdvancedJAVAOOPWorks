package work011Test.Variables;

import com.oopworks.work012.Variables.Task001;
import org.junit.Assert;
import org.junit.Test;

public class Task001Test {
    @Test
    public void testTask001() {

        Assert.assertEquals("Hello World", Task001.stringWorks01("Hello World"));
        Assert.assertEquals("123456789", Task001.stringWorks01("123456789"));
        Assert.assertEquals("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012", Task001.stringWorks01("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012"));

    }

    @Test
    public void testTask002() {

        Assert.assertEquals("The string is long enough", Task001.stringWorks02("Hello World"));
        Assert.assertEquals("The string is long enough", Task001.stringWorks02("123456789"));
        Assert.assertEquals("The string is long enough", Task001.stringWorks02("123456789012345678901234567890123456789012345678901234567890123456789012345678"));

    }
}
