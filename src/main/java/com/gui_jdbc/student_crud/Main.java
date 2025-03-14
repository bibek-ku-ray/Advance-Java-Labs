package com.gui_jdbc.student_crud;

public class Main {
    public static void main(String[] args) {
        StudentUI studentUI = new StudentUI();
        StudentDAO studentDAO = new StudentDAO();
        studentUI.setVisible(true);

        StudentController studentController = new StudentController(studentUI, studentDAO);

    }
}
