package com.bibek.IfElseLab;

import java.util.Scanner;

/*
    Name: Bibek Ray
    RollNo.: 407
 */

public class AgeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age of first person:");
        int age1 = scanner.nextInt();

        System.out.println("Enter age of second person:");
        int age2 = scanner.nextInt();

        System.out.println("Enter age of third person:");
        int age3 = scanner.nextInt();

        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));

        System.out.println("The oldest person is: " + oldest);
        System.out.println("The youngest person is: " + youngest);

        scanner.close();
    }
}

