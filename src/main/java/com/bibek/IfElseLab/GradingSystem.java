package com.bibek.IfElseLab;

import java.util.Scanner;
/*
    Name: Bibek Ray
    RollNo.: 407
 */
public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int marks = scanner.nextInt();

        if (marks < 25) {
            System.out.println("Your grade is: F");
        } else if (marks <= 45) {
            System.out.println("Your grade is: E");
        } else if (marks <= 50) {
            System.out.println("Your grade is: D");
        } else if (marks <= 60) {
            System.out.println("Your grade is: C");
        } else if (marks <= 80) {
            System.out.println("Your grade is: B");
        } else {
            System.out.println("Your grade is: A");
        }

        scanner.close();
    }
}

