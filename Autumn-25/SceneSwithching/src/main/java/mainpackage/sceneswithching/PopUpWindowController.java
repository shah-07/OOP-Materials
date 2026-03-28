package mainpackage.sceneswithching;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class PopUpWindowController
{
    @javafx.fxml.FXML
    private Label messageLabel;
    String a;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showButtonOA(ActionEvent actionEvent) {
        messageLabel.setText(a);
    }
}