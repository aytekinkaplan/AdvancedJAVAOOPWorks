package com.oopworks.work009;

public class ArrayOperations {
    public static int summArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
