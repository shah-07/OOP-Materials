package mainpackage.mini_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class DashBoardViewController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private Label nameLabel;
    @javafx.fxml.FXML
    private TextField input;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public void setNameAndId (String name, int id){
        idLabel.setText(Integer.toString(id));
        nameLabel.setText(name);
    }

    @javafx.fxml.FXML
    public void logoutButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPageView.fxml"));
        Node node = loader.load();
        mainPane.getChildren().setAll(node);

    }

    @javafx.fxml.FXML
    public void add(ActionEvent actionEvent) throws IOException{

        File f = new File("some.txt");
        FileOutputStream fos = new FileOutputStream(f);
        FileWriter fw = new FileWriter(f);
        fw.write("Hi");
        fw.close();



    }
}