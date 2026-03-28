package mainpackage.sceneswitching;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class PopupWindowController
{
    @javafx.fxml.FXML
    private Label messageLabel;

    String toRecieveVariable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewButtonOA(ActionEvent actionEvent) {

        messageLabel.setText(toRecieveVariable);

    }
}