package com.mvc.marksheet;

import javax.swing.*;
import java.awt.*;

public class MarksheetView extends JFrame {
    private JTextField ootMarksField;
    private JTextField oopMarksField;
    private JTextField dbMarksField;
    private JButton generateButton;
    private JButton closeButton;
    private JLabel totalMarksLabel;
    private JLabel totalPercentageLabel;
    private JLabel divisionLabel;
    private JLabel resultLabel;

    public MarksheetView() {
        setTitle("Marksheet Generator");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2));

        ootMarksField = new JTextField();
        oopMarksField = new JTextField();
        dbMarksField = new JTextField();
        generateButton = new JButton("Generate");
        closeButton = new JButton("Close");
        totalMarksLabel = new JLabel("Total Marks: 0.0");
        totalPercentageLabel = new JLabel("Total Percentage: 0.0");
        divisionLabel = new JLabel("Division: 1st/2nd/3rd/Fail");
        resultLabel = new JLabel("Result: PASS/FAIL");

        add(new JLabel("Enter OOT Marks:"));
        add(ootMarksField);
        add(new JLabel("Enter OOP Marks:"));
        add(oopMarksField);
        add(new JLabel("Enter DB Marks:"));
        add(dbMarksField);
        add(generateButton);
        add(closeButton);
        add(totalMarksLabel);
        add(totalPercentageLabel);
        add(divisionLabel);
        add(resultLabel);
    }

    public JTextField getOotMarksField() {
        return ootMarksField;
    }

    public JTextField getOopMarksField() {
        return oopMarksField;
    }

    public JTextField getDbMarksField() {
        return dbMarksField;
    }

    public JButton getGenerateButton() {
        return generateButton;
    }

    public JButton getCloseButton() {
        return closeButton;
    }

    public void setTotalMarks(double totalMarks) {
        totalMarksLabel.setText("Total Marks: " + totalMarks);
    }

    public void setTotalPercentage(double totalPercentage) {
        totalPercentageLabel.setText("Total Percentage: " + totalPercentage);
    }

    public void setDivision(String division) {
        divisionLabel.setText("Division: " + division);
    }

    public void setResult(String result) {
        resultLabel.setText("Result: " + result);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

