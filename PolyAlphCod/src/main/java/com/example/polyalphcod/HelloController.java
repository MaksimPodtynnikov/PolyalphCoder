package com.example.polyalphcod;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {

    public TextArea text;
    public TextArea code;
    @FXML
    private void textToCode()
    {
        code.setText(PolyAlphabet.encrypt(text.getText()));
    }
    @FXML
    private void codeToText()
    {
        code.setText(PolyAlphabet.decipher(text.getText()));
    }
}