package sample;

import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField txtField;
    @FXML
    TextArea textArea;


    public void messageEntered() {
        if (!txtField.getText().equals("")) {
            textArea.appendText(txtField.getText() + "\n");
            txtField.setText("");
        }
    }

}
