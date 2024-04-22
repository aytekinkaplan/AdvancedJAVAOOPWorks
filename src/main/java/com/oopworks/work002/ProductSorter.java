package com.oopworks.work002;

import java.util.Arrays;

public class ProductSorter {
    public static void sortByPrice(Product[] products) {
        Arrays.sort(products, (p1, p2) -> (int) ((p1).getPrice() - (p2).getPrice()));
    }
}
