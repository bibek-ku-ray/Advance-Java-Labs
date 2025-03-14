package com.gui_jdbc.student_crud;

public class StudentController {
    StudentDAO studentDAO ;
    StudentUI studentUI;
    Student student = new Student();

    public StudentController(StudentUI studentUI, StudentDAO studentDAO){
        this.studentUI = studentUI;
        this.studentDAO = studentDAO;
    }

    public void addStudent(){
        studentUI.addButton.addActionListener(e -> {
            System.out.println("Add button clicked");
            student.setAme(studentUI.nameField.getText());
            student.setEmail(studentUI.emailField.getText());
            student.setRollNo(Integer.parseInt(studentUI.passwordField.getText()));
            studentDAO.addStudent(student);
        });
    }

    public void updateStudent(){
        studentUI.updateButton.addActionListener(e -> {
            System.out.println("Update button clicked");
            student.setAme(studentUI.nameField.getText());
            student.setEmail(studentUI.emailField.getText());
            student.setRollNo(Integer.parseInt(studentUI.passwordField.getText()));
            studentDAO.updateStudent(1, student);
        });
    }



}
