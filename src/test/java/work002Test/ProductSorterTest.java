package work002Test;

import com.oopworks.work002.Product;
import com.oopworks.work002.ProductSorter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ProductSorterTest {
    @Test
    public void testSort() {
        Product[] products = new Product[]{
                new Product("Laptop", 1000, 10),
                new Product("Phone", 500, 10),
                new Product("Tablet", 200, 12),
                new Product("Camera", 100, 14),
                new Product("Printer", 200, 12),
                new Product("Monitor", 500, 16),
                new Product("Keyboard", 100, 10),
                new Product("Speaker", 100, 10),
                new Product("Headphones", 100, 10),
                new Product("Charger", 100, 10),
                new Product("Mousepad", 100, 10),
                new Product("Mouse", 50, 10)
        };
        ProductSorter.sortByPrice(products);

        Arrays.stream(products).forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));

        Assert.assertEquals("Mouse", products[0].getName());
        Assert.assertEquals("Camera", products[1].getName());
        Assert.assertEquals("Keyboard", products[2].getName());
        Assert.assertEquals("Speaker", products[3].getName());
        Assert.assertEquals("Headphones", products[4].getName());
        Assert.assertEquals("Charger", products[5].getName());
        Assert.assertEquals("Mousepad", products[6].getName());
        Assert.assertEquals("Tablet", products[7].getName());
        Assert.assertEquals("Printer", products[8].getName());
        Assert.assertEquals("Phone", products[9].getName());
        Assert.assertEquals("Monitor", products[10].getName());
        Assert.assertEquals("Laptop", products[11].getName());
    }
}
