package com.bibekLabs.MethodLab;
/*
    Name: Bibek Ray
    RollNo.: 407
*/
import java.util.Scanner;

public class TemperatureConversion {
    public static double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + "°C is " + toKelvin(celsius) + "K");
        System.out.println(celsius + "°C is " + toFahrenheit(celsius) + "°F");
    }
}

