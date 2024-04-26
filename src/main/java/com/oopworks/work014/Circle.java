package com.oopworks.work014;

public class Circle {

    public static double area(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        } else {
            System.out.println("You entered radius: " + radius);
            return Math.PI * radius * radius;
        }
    }
}
