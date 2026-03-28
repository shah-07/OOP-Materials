package mainpackage.sceneswithching;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FirstWindowController
{
    @javafx.fxml.FXML
    private AnchorPane partialPane;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TextField tf;
    String a;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void switchButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SwitchWindow.fxml"));
            Node node = loader.load();
            SwitchWindowController nextController = loader.getController();
            nextController.a = tf.getText();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void popupButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PopUpWindow.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            PopUpWindowController nextController = fxmlLoader.getController();
            nextController.a = tf.getText();
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void partialButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PartialWindow.fxml"));
            Node node = loader.load();
            PartialWindowController nextController = loader.getController();
            nextController.a = tf.getText();
            partialPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void accumulateButtonOA(ActionEvent actionEvent) {
        String a = tf.getText();
    }
}