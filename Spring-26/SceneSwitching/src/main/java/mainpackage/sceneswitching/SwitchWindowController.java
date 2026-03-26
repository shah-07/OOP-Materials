package mainpackage.sceneswitching;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class SwitchWindowController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void homeButtonOA(ActionEvent actionEvent) throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InitialWindow.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);


    }
}