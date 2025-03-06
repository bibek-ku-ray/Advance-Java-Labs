package com.bibek.marksheetMVC;

public class Main {
    public static void main(String[] args) {
        MarksheetModel model = new MarksheetModel();
        MarksheetView view = new MarksheetView();
        MarksheetController controller = new MarksheetController(model, view);

        view.setVisible(true);
    }
}

