package com.bibekLabs.LoopLab;

import java.util.Scanner;
/*
    Name: Bibek Ray
    RollNo.: 407
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String originalString = scanner.nextLine();
        String reversedString = "";

        int length = originalString.length();

        for (int i = length - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        if (originalString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

        scanner.close();
    }
}

