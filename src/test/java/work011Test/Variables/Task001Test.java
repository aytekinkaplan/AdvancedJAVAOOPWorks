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

    @Test
    public void testTask003() {

        Assert.assertEquals("HELLO WORLD", Task001.stringWorks03("Hello World"));


    }

    @Test
    public void testTask004() {

        Assert.assertEquals("hello world", Task001.stringWorks04("Hello World".toUpperCase()));


    }

    @Test
    public void testTask005() {

        Assert.assertEquals("DLROW OLLEH", Task001.stringWorks05("Hello World".toUpperCase()));


    }

    @Test
    public void testTask006() {
        Assert.assertEquals("Hello World", Task001.stringWorks06("Hello World"));
    }

    @Test
    public void testTask007() {
        Assert.assertEquals("d", Task001.stringWorks07("Hello World"));
    }

    @Test
    public void testTask008() {
        Assert.assertEquals("Hello World", Task001.stringWorks08(" Hello World "));
    }

    @Test
    public void testTask009() {
        Assert.assertEquals("-Hello-World-", Task001.stringWorks09(" Hello World "));
    }

    @Test
    public void testTask010() {
        Assert.assertEquals("32 72 101 108 108 111 32 87 111 114 108 100 32 ", Task001.stringWorks10(" Hello World "));
    }
}
