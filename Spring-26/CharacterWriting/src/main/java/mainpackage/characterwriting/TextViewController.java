package mainpackage.characterwriting;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class TextViewController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TextField engineNumberTF;
    @javafx.fxml.FXML
    private TextField modelTF;
    @javafx.fxml.FXML
    private TextField licenceNumTF;
    @javafx.fxml.FXML
    private TextField stringTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOA(ActionEvent actionEvent) {

        Car c = new Car(modelTF.getText(), engineNumberTF.getText(), Integer.parseInt(licenceNumTF.getText()));
        File f = new File("Car.bin");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void nextPageButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("page2.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void addStringButtonOA(ActionEvent actionEvent) {

        String s = stringTF.getText();

        File f = new File("some.txt");

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(s);
            fw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}