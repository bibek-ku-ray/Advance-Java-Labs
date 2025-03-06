package com.bibek.eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest extends JFrame implements ActionListener {

    JTextField textField = new JTextField(10);
    JButton button = new JButton("Enter");
    JButton buttonDelete = new JButton("Delete");

    public ActionListenerTest() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 300);
        setVisible(true);

        prepareGUI();



        button.addActionListener(this);
        buttonDelete.addActionListener(this);
    }

    private void prepareGUI() {
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.add(textField);
        window.add(button);
        window.add(buttonDelete);
    }

    public static void main(String[] args) {
        new ActionListenerTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
//        System.out.println(textField.getText());


        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(button, textField.getText());

        } else if (e.getSource() == buttonDelete) {
            int i = JOptionPane.showConfirmDialog(buttonDelete, "Are you sure you want to delete?");
            System.out.println(i);
        }
    }
}
