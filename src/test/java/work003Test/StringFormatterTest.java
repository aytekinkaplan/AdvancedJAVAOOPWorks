package work003Test;

import com.oopworks.work003.StringFormatter;
import org.junit.Assert;
import org.junit.Test;

public class StringFormatterTest {
    @Test
    public void testStringFormatter01() {
        Assert.assertEquals("Hello World".toUpperCase(), StringFormatter.toUpper("Hello World"));
    }

    @Test
    public void testStringFormatter02() {
        Assert.assertEquals("hello world".toLowerCase(), StringFormatter.toLower("Hello World"));
    }

    @Test
    public void testStringFormatter03() {
        Assert.assertEquals("Hello world", StringFormatter.capitalize("hello world"));
    }

    @Test
    public void testStringFormatter04() {
        Assert.assertEquals("hello World", StringFormatter.uncapitalize("Hello World"));
    }

    @Test
    public void testStringFormatter05() {
        Assert.assertEquals("dlroW olleH", StringFormatter.reverse("Hello World"));
    }

    @Test
    public void testStringFormatter06() {
        Assert.assertEquals("Hello World", StringFormatter.trim(" Hello World "));
    }

    @Test
    public void testStringFormatter07() {
        Assert.assertEquals("Hello WorldHello WorldHello World", StringFormatter.repeat("Hello World", 3));
    }

    @Test
    public void testStringFormatter08() {
        Assert.assertEquals("Hello World", StringFormatter.substring("Hello World", 0, 11));
    }

    @Test
    public void testStringFormatter09() {
        Assert.assertEquals("World", StringFormatter.substring("Hello World", 6));
    }

    @Test
    public void testStringFormatter10() {
        Assert.assertEquals("World", StringFormatter.substring("Hello World", 6, 11));
    }

    @Test
    public void testStringFormatter11() {
        Assert.assertEquals("W", StringFormatter.substring("Hello World", 6, 7));
    }


}
