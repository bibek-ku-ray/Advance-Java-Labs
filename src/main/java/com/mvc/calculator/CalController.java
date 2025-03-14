package com.mvc.calculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalController {
    private CalModel model;
    private CalView view;

    public CalController(CalModel model, CalView view) {
        this.model = model;
        this.view = view;

        view.getCalculateButton().addActionListener(new CalculateButtonListener());
        view.getCloseButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = Double.parseDouble(view.getFirstNumberField().getText());
                double secondNumber = Double.parseDouble(view.getSecondNumberField().getText());

                model.setFirstNumber(firstNumber);
                model.setSecondNumber(secondNumber);

                double result = 0;
                if (view.getAddButton().isSelected()) {
                    result = model.add();
                } else if (view.getSubButton().isSelected()) {
                    result = model.subtract();
                } else if (view.getMulButton().isSelected()) {
                    result = model.multiply();
                } else if (view.getDivButton().isSelected()) {
                    result = model.divide();
                }

                view.showResultMessage("Result: " + result);
            } catch (NumberFormatException ex) {
                view.showErrorMessage("Please enter valid numbers");
            } catch (ArithmeticException ex) {
                view.showErrorMessage(ex.getMessage());
            }
        }
    }
}
