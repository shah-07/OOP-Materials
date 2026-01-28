package mainpackage.simpleproject;

import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleViewController
{
    @javafx.fxml.FXML
    private TextField inputField;
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void buttonOnClick(Event event) {

        // String a = inputField.getText();

        outputLabel.setText(inputField.getText());


    }
}