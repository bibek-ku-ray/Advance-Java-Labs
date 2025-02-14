package com.bibek.LoopLab;

import java.util.Scanner;
/*
    Name: Bibek Ray
    RollNo.: 407
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}

