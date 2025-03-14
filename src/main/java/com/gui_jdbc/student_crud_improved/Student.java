package com.gui_jdbc.student_crud_improved;

/**
 * Entity class representing a student
 */
public class Student {
    private int id;
    private String name; // Fixed typo "ame" to "name"
    private String email;
    private int rollNo;

    public Student(String name, String email, int rollNo) {
        this.name = name;
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

    public String getName() { // Fixed method name
        return name;
    }

    public void setName(String name) { // Fixed method name
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}