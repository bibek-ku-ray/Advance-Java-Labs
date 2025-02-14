package com.bibek.MethodLab;

import java.util.Scanner;

public class CurrencyConversion {
    public static double toUSD(double npr) {
        final double exchangeRate = 0.0078;
        return npr * exchangeRate;
    }

    public static double toCAD(double npr) {
        final double exchangeRate = 0.0098;
        return npr * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in NPR: ");
        double npr = scanner.nextDouble();
        System.out.println(npr + " NPR is " + toUSD(npr) + " USD");
        System.out.println(npr + " NPR is " + toCAD(npr) + " CAD");
    }
}

