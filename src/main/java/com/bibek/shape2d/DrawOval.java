package com.bibek.shape2d;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        g.drawOval (10, 10, 200, 200);

    }
}

public class DrawOval {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }
}