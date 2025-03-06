package com.bibek.calAssignmentMVC;

import javax.swing.*;
        import java.awt.*;

public class CalView extends JFrame {
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JRadioButton addButton;
    private JRadioButton subButton;
    private JRadioButton mulButton;
    private JRadioButton divButton;
    private JButton calculateButton;
    private JButton closeButton;

    public CalView() {
        setTitle("Arithmetic Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        firstNumberField = new JTextField();
        secondNumberField = new JTextField();
        addButton = new JRadioButton("Add");
        subButton = new JRadioButton("Sub");
        mulButton = new JRadioButton("Mul");
        divButton = new JRadioButton("Div");
        ButtonGroup group = new ButtonGroup();
        group.add(addButton);
        group.add(subButton);
        group.add(mulButton);
        group.add(divButton);
        calculateButton = new JButton("Calculate");
        closeButton = new JButton("Close");

        add(new JLabel("Enter first no:"));
        add(firstNumberField);
        add(new JLabel("Enter second no:"));
        add(secondNumberField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(calculateButton);
        add(closeButton);
    }

    public JTextField getFirstNumberField() {
        return firstNumberField;
    }

    public JTextField getSecondNumberField() {
        return secondNumberField;
    }

    public JRadioButton getAddButton() {
        return addButton;
    }

    public JRadioButton getSubButton() {
        return subButton;
    }

    public JRadioButton getMulButton() {
        return mulButton;
    }

    public JRadioButton getDivButton() {
        return divButton;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public JButton getCloseButton() {
        return closeButton;
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showResultMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
