package com.oopworks.work014;

public class Triangle {
    public static int area(int base, int height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be greater than 0");
        } else {
            System.out.println("You entered base: " + base + ", You entered height: " + height);
            return base * height / 2;
        }
    }
}
