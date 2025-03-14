package com.gui_jdbc.student_crud_improved;

import javax.swing.*;

/**
 * Controller class for handling student operations
 */
public class StudentController {
    private final StudentDAO studentDAO;
    private final StudentUI studentUI;

    /**
     * Creates a controller with UI and DAO dependencies
     * @param studentUI the user interface
     * @param studentDAO the data access object
     */
    public StudentController(StudentUI studentUI, StudentDAO studentDAO) {
        this.studentUI = studentUI;
        this.studentDAO = studentDAO;
        initializeEventHandlers();
    }

    /**
     * Sets up all event handlers for UI components
     */
    private void initializeEventHandlers() {
        studentUI.getAddButton().addActionListener(e -> handleAddStudent());
        studentUI.getUpdateButton().addActionListener(e -> handleUpdateStudent());
        studentUI.getDeleteButton().addActionListener(e -> handleDeleteStudent());
    }

    /**
     * Handles the add student operation
     */
    private void handleAddStudent() {
        try {
            Student student = createStudentFromInput();
            if (student != null) {
                boolean success = studentDAO.addStudent(student);
                showFeedback(success, "Student added successfully", "Failed to add student");
                if (success) {
                    studentUI.clearFields();
                }
            }
        } catch (Exception ex) {
            showError("Error adding student: " + ex.getMessage());
        }
    }

    /**
     * Handles the update student operation
     */
    private void handleUpdateStudent() {
        try {
            String idText = JOptionPane.showInputDialog(studentUI, "Enter Student ID to update:");
            if (idText != null && !idText.trim().isEmpty()) {
                int id = Integer.parseInt(idText);
                Student student = createStudentFromInput();
                if (student != null) {
                    boolean success = studentDAO.updateStudent(id, student);
                    showFeedback(success, "Student updated successfully", "Failed to update student");
                    if (success) {
                        studentUI.clearFields();
                    }
                }
            }
        } catch (NumberFormatException ex) {
            showError("Invalid ID format. Please enter a number.");
        } catch (Exception ex) {
            showError("Error updating student: " + ex.getMessage());
        }
    }

    /**
     * Handles the delete student operation
     */
    private void handleDeleteStudent() {
        try {
            String idText = JOptionPane.showInputDialog(studentUI, "Enter Student ID to delete:");
            if (idText != null && !idText.trim().isEmpty()) {
                int id = Integer.parseInt(idText);
                boolean success = studentDAO.deleteStudent(id);
                showFeedback(success, "Student deleted successfully", "Failed to delete student");
            }
        } catch (NumberFormatException ex) {
            showError("Invalid ID format. Please enter a number.");
        } catch (Exception ex) {
            showError("Error deleting student: " + ex.getMessage());
        }
    }

    /**
     * Creates a Student object from UI input fields
     * @return a Student object or null if validation fails
     */
    private Student createStudentFromInput() {
        String name = studentUI.getNameField().getText().trim();
        String email = studentUI.getEmailField().getText().trim();
        String rollNoText = studentUI.getRollNoField().getText().trim();

        if (name.isEmpty() || email.isEmpty() || rollNoText.isEmpty()) {
            showError("All fields are required");
            return null;
        }

        try {
            int rollNo = Integer.parseInt(rollNoText);
            return new Student(name, email, rollNo);
        } catch (NumberFormatException ex) {
            showError("Roll Number must be a valid integer");
            return null;
        }
    }

    private void showFeedback(boolean success, String successMessage, String failureMessage) {
        if (success) {
            JOptionPane.showMessageDialog(studentUI, successMessage, "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(studentUI, failureMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(studentUI, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}