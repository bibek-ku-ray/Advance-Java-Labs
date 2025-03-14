package com.gui_jdbc.student_crud;

public class Student {
    private  int id;
    private String ame;
    private String email;
    private int rollNo;

    public Student(String ame, String email, int rollNo) {
        this.ame = ame;
        this.email = email;
        this.rollNo = rollNo;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getAme() {
        return ame;
    }

    public void setAme(String ame) {
        this.ame = ame;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
