package com.bibekLabs.MethodLab;
/*
    Name: Bibek Ray
    RollNo.: 407
*/
import java.util.Scanner;

public class PalindromeInt {
    public static boolean isPalindromeInt(int number) {
        return number == reverseInt(number);
    }

    public static int reverseInt(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println(number + " is " + (isPalindromeInt(number) ? "a Palindrome" : "not a Palindrome"));
    }
}

