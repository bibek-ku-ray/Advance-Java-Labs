package com.bibekLabs.IfElseLab;
import java.util.Scanner;
/*
    Name: Bibek Ray
    RollNo.: 407
 */
public class AttendanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of classes held:");
        int classesHeld = scanner.nextInt();

        System.out.println("Enter number of classes attended:");
        int classesAttended = scanner.nextInt();

        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;
        System.out.println("Attendance percentage: " + attendancePercentage + "%");

        if (attendancePercentage < 75) {
            System.out.println("Student is not allowed to sit in exam.");
        } else {
            System.out.println("Student is allowed to sit in exam.");
        }

        scanner.close();
    }
}

