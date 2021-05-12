package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField textField;
    @FXML
    TextArea textArea;

    @FXML
    Button sendButton;


    public void messageEntered() {
        if (!textField.getText().equals("")) {
            textArea.appendText(textField.getText() + "\n");
            textField.setText("");
        }
    }

}
