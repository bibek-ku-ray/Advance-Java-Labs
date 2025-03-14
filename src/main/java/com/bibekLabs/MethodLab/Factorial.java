package com.bibekLabs.MethodLab;
/*
    Name: Bibek Ray
    RollNo.: 407
*/
import java.util.Scanner;

public class Factorial {
    public static long factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}

