package work010Test;

import com.oopworks.work011.StringWorks;
import org.junit.Assert;
import org.junit.Test;

public class StringWorksTest {
    @Test
    public void testStringWorks() {
        StringWorks.stringWorks("Hello World");
        StringWorks.stringWorks("123456789");
        StringWorks.stringWorks("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012");

        Assert.assertEquals("HelloWorld", StringWorks.stringWorks("HelloWorld"));
        Assert.assertEquals("123456789", StringWorks.stringWorks("123456789"));
        Assert.assertEquals("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012", StringWorks.stringWorks("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012"));


    }
}
