package com.gui_jdbc.login.loginui;

import com.bibek.login.logindb.Login;
import com.bibek.login.logindb.LoginService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


class LoginFrame extends JFrame {
    private final JTextField nameField;
    private final JTextField emailField;
    private final JPasswordField passwordField;
    private final DefaultTableModel tableModel;

    public LoginFrame() {
        setTitle("Login Form");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));

        // Left panel - Form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 10, 10));

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        formPanel.add(emailField);

        formPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        formPanel.add(passwordField);

        JButton submitButton = new JButton("Submit");
        formPanel.add(submitButton);

        // Placeholder panel to balance layout
        formPanel.add(new JLabel(""));

        // Right panel - Data Table
        String[] columnNames = {"Name", "Email", "Password"};
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable dataTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(dataTable);

        add(formPanel);
        add(scrollPane);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDataToTable();
            }
        });
        updateTable();
        setVisible(true);
    }

    private void addDataToTable() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        LoginService loginService = new LoginService();

        Login loginUser = new Login(name, email, password);

        loginService.addUser(loginUser);

        if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            tableModel.addRow(new Object[]{name, email, password});
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTable(){
        LoginService loginService = new LoginService();
        Login login = new Login();

        List<Login> allUser = loginService.getAllUser();
        for(Login login1: allUser){
            tableModel.addRow(new Object[]{login1.getName(), login1.getEmail(), login1.getPassword()});
        }

    }
}

