package com.oopworks.work014;

import java.util.Scanner;

public class Runner {
    public static void instruction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your geometrical figure Number: ");
        System.out.println("Number 1: Square, Number 2: Rectangle, Number 3: Triangle, Number 4: Circle");
        int number = scanner.nextInt();

        double area = 0;

        switch (number) {
            case 1:
                System.out.println("Enter side: ");
                area = Square.area(scanner.nextInt());
                break;
            case 2:
                System.out.println("Enter length and width: ");
                area = Rectangle.area(scanner.nextInt(), scanner.nextInt());
                break;
            case 3:
                System.out.println("Enter base and height: ");
                area = Triangle.area(scanner.nextInt(), scanner.nextInt());
                break;
            case 4:
                System.out.println("Enter radius: ");
                area = Circle.area(scanner.nextInt());
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

        System.out.println("Area: " + area);
    }
}
