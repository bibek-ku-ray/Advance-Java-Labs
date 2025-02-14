package com.bibek.MethodLab;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Reverse of '" + str + "' is '" + reverseString(str) + "'");
    }
}

