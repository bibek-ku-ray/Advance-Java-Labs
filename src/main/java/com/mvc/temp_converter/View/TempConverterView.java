package com.mvc.temp_converter.View;

import javax.swing.*;
import java.awt.*;

public class TempConverterView extends JFrame {

    public JLabel celsiusLabel = new JLabel("Celsius");
    public JTextField celsiusField = new JTextField(23);
    JLabel fahrenheitLabel = new JLabel("Fahrenheit");
    JLabel kelvinLabel = new JLabel("Kelvin");
    public JLabel resultLabel = new JLabel("Result");
    public JButton convertButton = new JButton("Convert");

    String tempUnits[] = {"Fahrenheit", "Kelvin"};
    public JComboBox<String> tempUnit = new JComboBox<>(tempUnits);

    public TempConverterView(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setSize(300, 200);
        prepareGUI();
        setVisible(true);
    }
    void prepareGUI(){
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.add(celsiusLabel);
        window.add(celsiusField);
//        window.add(fahrenheitLabel);
//        window.add(new JTextField());
//        window.add(kelvinLabel);
//        window.add(new JTextField());



        window.add(tempUnit);

        window.add(convertButton);
        window.add(resultLabel);

    }

}
