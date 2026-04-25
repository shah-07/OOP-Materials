package mainpackage.finalexam_8_2420181;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class DataCreationViewController2420181
{
    @javafx.fxml.FXML
    private TextField discountPercentage;
    @javafx.fxml.FXML
    private ComboBox <String> furnitureType;
    @javafx.fxml.FXML
    private TextField furnitureDescription;
    @javafx.fxml.FXML
    private TextField vatPercentage;
    @javafx.fxml.FXML
    private TextField price;
    @javafx.fxml.FXML
    private CheckBox imported;
    @javafx.fxml.FXML
    private TextField furnitureID;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        furnitureType.getItems().addAll("Chair", "Table", "Bed", "Cabinet");
    }

    @javafx.fxml.FXML
    public void gotoButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DataProcessingView2420181.fxml"));
        Node node = loader.load();
        mainPane.getChildren().setAll(node);
    }

    @javafx.fxml.FXML
    public void validateAndAddButtonOA(ActionEvent actionEvent) {


        Alert a = new Alert(Alert.AlertType.ERROR);

        if (imported.isSelected() && Float.parseFloat(vatPercentage.getText()) < 20 ){
            a.setContentText("If item is imported vat percentage must be equal or more then 20");
            a.showAndWait();
            return;
        }

        if (Float.parseFloat(vatPercentage.getText()) < 10 &&  Float.parseFloat(vatPercentage.getText()) % 5 != 0){
            a.setContentText("Vat percentage must be equal of more than 10 and multiple of 5");
            a.showAndWait();
            return;
        }

        Furniture f = new Furniture(
                Integer.parseInt(furnitureID.getText()),
                imported.isSelected(),
                Float.parseFloat(vatPercentage.getText()),
                Float.parseFloat(discountPercentage.getText()),
                Float.parseFloat(price.getText()),
                furnitureType.getValue(),
                furnitureDescription.getText());

        File file = new File("Furniture.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(f);
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}