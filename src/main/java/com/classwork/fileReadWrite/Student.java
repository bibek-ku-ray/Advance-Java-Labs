package com.classwork.fileReadWrite;

import java.io.Serializable;

public class Student implements Serializable {
    static int noOfStudent = 34;
    private int roll;
    private String name;
    private String email;

    public Student(){
        System.out.println("inside default implicit");
    }

    public Student(int roll, String name, String email) {
        this.roll = roll;
        this.name = name;
        this.email = email;
    }

    public static int getNoOfStudent() {
        return noOfStudent;
    }

    public static void setNoOfStudent(int noOfStudent) {
        Student.noOfStudent = noOfStudent;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
