package com.bibekLabs.LoopLab;

import java.util.Scanner;
/*
    Name: Bibek Ray
    RollNo.: 407
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}

