package com.gui_jdbc.student_crud_improved;

import javax.swing.*;
import java.awt.*;

/**
 * User interface for student operations
 */
public class StudentUI extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JTextField rollNoField;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton clearButton;

    /**
     * Creates and initializes the student UI
     */
    public StudentUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Student Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel with form fields
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        rollNoField = new JTextField(20);

        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Roll Number:"));
        formPanel.add(rollNoField);

        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);

        // Add clear functionality
        clearButton.addActionListener(e -> clearFields());

        // Main container layout
        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    /**
     * Clears all input fields
     */
    public void clearFields() {
        nameField.setText("");
        emailField.setText("");
        rollNoField.setText("");
    }

    // Getters for controller access
    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getRollNoField() {
        return rollNoField;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }
}