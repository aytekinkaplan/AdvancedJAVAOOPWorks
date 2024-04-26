package com.oopworks.work014;

public class Rectangle {
    public static int area(int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        } else {
            System.out.println("You entered length: " + length + ", You entered width: " + width);
            return length * width;
        }
    }
}
