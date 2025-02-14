package com.bibek.IfElseLab;

import java.util.Scanner;
/*
    Name: Bibek Ray
    RollNo.: 407
 */
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your years of service:");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your net bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Your years of service are less than 5.");
        }

        scanner.close();
    }
}

