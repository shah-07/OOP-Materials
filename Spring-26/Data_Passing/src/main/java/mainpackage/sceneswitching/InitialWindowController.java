package mainpackage.sceneswitching;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InitialWindowController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private AnchorPane partialPane;
    @javafx.fxml.FXML
    private TextField inputTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void popUpButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PopupWindow.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            PopupWindowController popupWindowController = fxmlLoader.getController();
            popupWindowController.toRecieveVariable = inputTF.getText();
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void switchButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SwitchWindow.fxml"));
            Node node = fxmlLoader.load();
            SwitchWindowController switchWindowController = fxmlLoader.getController();
            switchWindowController.toRecieveStringVar = inputTF.getText();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void partialButtonOA(ActionEvent actionEvent) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PartialWindow.fxml"));
            Node node = fxmlLoader.load();
            PartialWindowController partialWindowController = fxmlLoader.getController();
            partialWindowController.toRecieveStringVar = inputTF.getText();
            partialPane.getChildren().setAll(node);

            /*
            Node node = FXMLLoader.load(getClass().getResource("PartialWindow.fxml"));
            partialPane.getChildren().setAll(node);
             */

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}