package com.bibek.MethodLab;

import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindromeString(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("'" + str + "' is " + (isPalindromeString(str) ? "a Palindrome" : "not a Palindrome"));
    }
}

