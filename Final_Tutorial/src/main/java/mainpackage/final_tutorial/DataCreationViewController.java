package mainpackage.final_tutorial;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class DataCreationViewController
{
    @javafx.fxml.FXML
    private TextField areaTF;
    @javafx.fxml.FXML
    private TextField ownerNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> locationCCB;
    @javafx.fxml.FXML
    private TextField pharmacyNameTF;
    @javafx.fxml.FXML
    private TextField tradeTF;
    @javafx.fxml.FXML
    private ComboBox<Boolean> chainPharmacyCB;
    @javafx.fxml.FXML
    private DatePicker openingDateDP;
    @javafx.fxml.FXML
    private ComboBox<Integer> zipCodeCB;

    Alert a = new Alert(Alert.AlertType.ERROR);
    @javafx.fxml.FXML
    private AnchorPane anchorPane;

    @javafx.fxml.FXML
    public void initialize() {

        zipCodeCB.getItems().addAll(1228, 1229, 1230, 1231, 132);
        locationCCB.getItems().addAll("Mall", "City", "Market");
        chainPharmacyCB.getItems().addAll(true, false);

    }

    @javafx.fxml.FXML
    public void addButtonOA(ActionEvent actionEvent) {

        if (chainPharmacyCB.getValue() == true && Float.parseFloat(areaTF.getText())<500){
            a.setContentText("If pharmacy is chained,the cannot be less than 500 sq Ft");
            a.showAndWait();
            return;
        }
        Pharmacy p = new Pharmacy(pharmacyNameTF.getText(),
                zipCodeCB.getValue(),
                Float.parseFloat(areaTF.getText()),
                Long.parseLong(areaTF.getText()),
                openingDateDP.getValue(),
                chainPharmacyCB.getValue(),
                locationCCB.getValue(),
                ownerNameTF.getText());

        FileOutputStream fis;
        ObjectOutputStream oos;
        File f = new File("Chair.bin");

        try{
            if (f.exists()){
                fis = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fis);
            }
            else{
                fis = new FileOutputStream(f);
                oos = new ObjectOutputStream(fis);
            }
            oos.writeObject(p);
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void nextPageButtonOA(ActionEvent actionEvent) throws IOException{
        Node node = FXMLLoader.load(getClass().getResource("DataProcessingViewYourID.fxml"));
        anchorPane.getChildren().setAll(node);

    }
}