package com.bibekLabs.MethodLab;
/*
    Name: Bibek Ray
    RollNo.: 407
*/
import java.util.Scanner;

public class OddEven {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println(n +" is Even");
        } else {
            System.out.println(n +" is Odd");
        }
    }
}