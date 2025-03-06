package com.bibek.marksheetMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksheetController {
    private MarksheetModel model;
    private MarksheetView view;

    public MarksheetController(MarksheetModel model, MarksheetView view) {
        this.model = model;
        this.view = view;

        view.getGenerateButton().addActionListener(new GenerateButtonListener());
        view.getCloseButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private class GenerateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double ootMarks = Double.parseDouble(view.getOotMarksField().getText());
                double oopMarks = Double.parseDouble(view.getOopMarksField().getText());
                double dbMarks = Double.parseDouble(view.getDbMarksField().getText());

                model.setOotMarks(ootMarks);
                model.setOopMarks(oopMarks);
                model.setDbMarks(dbMarks);

                view.setTotalMarks(model.getTotalMarks());
                view.setTotalPercentage(model.getTotalPercentage());
                view.setDivision(model.getDivision());
                view.setResult(model.getResult());
            } catch (NumberFormatException ex) {
                view.showErrorMessage("Please enter valid marks");
            }
        }
    }
}

