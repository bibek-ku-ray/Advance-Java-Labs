package com.bibekLabs.MethodLab;
/*
    Name: Bibek Ray
    RollNo.: 407
*/
import java.util.Scanner;

public class ReverseInt {
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
        System.out.println("Reverse of " + number + " is " + reverseInt(number));
    }
}
