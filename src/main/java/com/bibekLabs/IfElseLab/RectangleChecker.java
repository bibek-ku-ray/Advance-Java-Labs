package com.bibekLabs.IfElseLab;

import java.util.Scanner;
/*
    Name: Bibek Ray
    RollNo.: 407
 */
public class RectangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }

        scanner.close();
    }
}