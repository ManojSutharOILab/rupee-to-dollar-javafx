package com.oilab.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button convertButton;
    @FXML
    private Label dollarLabel;
    @FXML
    private TextField rupeeField;

    public static final float DOLLAR = 75.60F;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        float rupee = Float.parseFloat(rupeeField.getText());
        float dollar = rupee/DOLLAR;
        dollarLabel.setText("$ "+String.valueOf(dollar));
    }
}