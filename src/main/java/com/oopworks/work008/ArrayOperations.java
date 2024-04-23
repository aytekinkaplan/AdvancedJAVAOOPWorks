package com.oopworks.work008;

public class ArrayOperations {
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
