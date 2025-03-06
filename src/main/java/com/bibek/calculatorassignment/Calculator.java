package com.bibek.calculatorassignment;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonClear;
    JButton[] button = new JButton[10];
    float result, num1, num2;
    int index;
    JTextField resultField;
    char operator;

    public Calculator() {
        super("Calculator");
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i <= 9; i++) {
            button[i] = new JButton(i + "");
            panel.add(button[i]);
            button[i].addActionListener(this);
        }
        buttonAdd = new JButton("+");
        panel.add(buttonAdd);
        buttonAdd.addActionListener(this);

        buttonSubtract = new JButton("-");
        panel.add(buttonSubtract);
        buttonSubtract.addActionListener(this);

        buttonMultiply = new JButton("*");
        panel.add(buttonMultiply);
        buttonMultiply.addActionListener(this);

        buttonDivide = new JButton("/");
        panel.add(buttonDivide);
        buttonDivide.addActionListener(this);

        buttonEquals = new JButton("=");
        panel.add(buttonEquals);
        buttonEquals.addActionListener(this);

        buttonClear = new JButton("C");
        panel.add(buttonClear);
        buttonClear.addActionListener(this);

        resultField = new JTextField(10);
        add(panel, BorderLayout.CENTER);
        add(resultField, BorderLayout.NORTH);
        setVisible(true);
        setSize(200, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        JButton pressedButton = (JButton) ae.getSource();
        if (pressedButton == buttonClear) {
            result = num1 = num2 = 0;
            resultField.setText("");
        } else if (pressedButton == buttonEquals) {
            num2 = Integer.parseInt(resultField.getText());
            eval();
            resultField.setText("" + result);
        } else {
            boolean operatorFlag = false;
            if (pressedButton == buttonAdd) {
                operator = '+';
                operatorFlag = true;
            }
            if (pressedButton == buttonSubtract) {
                operator = '-';
                operatorFlag = true;
            }
            if (pressedButton == buttonMultiply) {
                operator = '*';
                operatorFlag = true;
            }
            if (pressedButton == buttonDivide) {
                operator = '/';
                operatorFlag = true;
            }

            if (!operatorFlag) {
                for (index = 0; index < 10; index++) {
                    if (pressedButton == button[index]) {
                        String t = resultField.getText();
                        t += index;
                        resultField.setText(t);
                    }
                }
            } else {
                num1 = Integer.parseInt(resultField.getText());
                resultField.setText("");
            }
        }
    }

    void eval() {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
    }

    public static void main(String[] arg) {
        new Calculator();
    }
}
