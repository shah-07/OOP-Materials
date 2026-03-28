package mainpackage.sceneswithching;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
public class PartialWindowController
{
    @javafx.fxml.FXML
    private Label label;
    String a;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showButtonOA(ActionEvent actionEvent) {
        label.setText(a);
    }
}