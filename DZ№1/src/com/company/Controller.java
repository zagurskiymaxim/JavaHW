package com.company;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void start() {
        while(true) {
            String message = model.processMessage();
            view.printMessage(message);
        }
    }
}
