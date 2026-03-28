package mainpackage.sceneswitching;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class PartialWindowController
{
    @javafx.fxml.FXML
    private Label label;
    String toRecieveStringVar;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showButtonOA(ActionEvent actionEvent) {

        label.setText(toRecieveStringVar);

    }
}