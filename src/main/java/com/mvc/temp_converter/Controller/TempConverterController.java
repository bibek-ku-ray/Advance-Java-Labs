package com.mvc.temp_converter.Controller;

import com.bibek.Model.TempConverterModel;
import com.bibek.View.TempConverterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConverterController implements ActionListener {

    TempConverterView view = new TempConverterView();
    TempConverterModel model = new TempConverterModel();

    TempConverterController(){
        view.convertButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        String inputTemp = view.celsiusField.getText();
        
        String result = "";
        
        if(view.tempUnit.getSelectedItem().equals("Fahrenheit")){
            result = model.celsiusToFahrenheit(Double.parseDouble(inputTemp)) + "";
        } else if(view.tempUnit.getSelectedItem().equals("Kelvin")){
            result = model.celsiusToKelvin(Double.parseDouble(inputTemp)) + "";
        }
        view.resultLabel.setText(result);
    }

    public static void main(String[] args) {
            new TempConverterController();
    }

}
