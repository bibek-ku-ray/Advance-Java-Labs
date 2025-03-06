package com.bibek.calAssignmentMVC;


public class Main {
    public static void main(String[] args) {
        CalModel model = new CalModel();
        CalView view = new CalView();
        CalController controller = new CalController(model, view);

        view.setVisible(true);
    }
}

