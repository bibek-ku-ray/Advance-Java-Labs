package com.gui_jdbc.student_crud_improved;

import javax.swing.*;

/**
 * Main application class
 */
public class Main {
    public static void main(String[] args) {
        // Run UI in the event dispatch thread
        SwingUtilities.invokeLater(() -> {
            try {
                // Create and show the UI
                StudentUI studentUI = new StudentUI();
                StudentDAO studentDAO = new StudentDAO();

                // Create controller and connect to UI
                StudentController studentController = new StudentController(studentUI, studentDAO);

                // Make the UI visible
                studentUI.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,
                        "Application error: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}