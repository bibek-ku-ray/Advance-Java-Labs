package com.gui_jdbc.student_crud;

import javax.swing.*;
import java.awt.*;

public class StudentUI extends JFrame {
    JTextField nameField;
    JTextField emailField;
    JTextField passwordField;
    JButton addButton;
    JButton updateButton;
    JButton deleteButton;

    public StudentUI(){
        setTitle("Student");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JTextField();
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        add(new JLabel("Enter Name:"));
        add(nameField);
        add(new JLabel("Enter Email:"));
        add(emailField);
        add(new JLabel("Enter Password:"));
        add(passwordField);
        add(addButton);
        add(updateButton);
        add(deleteButton);
    }
}
