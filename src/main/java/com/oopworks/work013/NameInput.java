package com.oopworks.work013;

import java.util.Scanner;

public class NameInput {
    public static String getNameFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }
}
