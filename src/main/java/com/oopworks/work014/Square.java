package com.oopworks.work014;

public class Square {
    public static int area(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            System.out.println("You entered length: " + length);
            return length * length;
        }
    }
}
