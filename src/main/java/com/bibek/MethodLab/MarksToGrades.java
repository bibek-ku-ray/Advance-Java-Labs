package com.bibek.MethodLab;
/*
    Name: Bibek Ray
    RollNo.: 407
*/

import java.util.Scanner;

public class MarksToGrades {
    public static char getGrade(int marks) {
        if (marks >= 70 && marks <= 100) return 'A';
        if (marks >= 60 && marks < 70) return 'B';
        if (marks >= 50 && marks < 60) return 'C';
        if (marks >= 40 && marks < 50) return 'D';
        if (marks >= 5 && marks < 40) return 'F';
        return 'G';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        System.out.println("Marks: " + marks + " Grade: " + getGrade(marks));
    }
}

