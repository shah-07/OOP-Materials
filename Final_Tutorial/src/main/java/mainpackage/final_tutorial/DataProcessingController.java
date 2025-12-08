package mainpackage.final_tutorial;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class DataProcessingController
{
    @javafx.fxml.FXML
    private ComboBox <Integer> zipCodeFilterCB;
    @javafx.fxml.FXML
    private TableColumn<Pharmacy, Float> areaTC;
    @javafx.fxml.FXML
    private TableView<Pharmacy> pharmacyTV;
    @javafx.fxml.FXML
    private TextField areaFilterCB;
    @javafx.fxml.FXML
    private TableColumn<Pharmacy, String> pharmacyNameTC;
    @javafx.fxml.FXML
    private TableColumn<Pharmacy, Boolean> isChainTC;
    @javafx.fxml.FXML
    private TableColumn<Pharmacy, Integer> zipCodeTC;

    @javafx.fxml.FXML
    public void initialize() {

        zipCodeFilterCB.getItems().addAll(1228, 1229, 1230, 1231, 1232);
        areaTC.setCellValueFactory(new PropertyValueFactory<>("areaInSqFt"));
        pharmacyNameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        isChainTC.setCellValueFactory(new PropertyValueFactory<>("chainPharmacy"));
        zipCodeTC.setCellValueFactory(new PropertyValueFactory<>("zipCode"));

    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {

        try{
            FileInputStream fis = new FileInputStream("Chair.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true){
                try{
                    Pharmacy p = (Pharmacy) ois.readObject();
                    if(Float.parseFloat(areaFilterCB.getText()) == p.getAreaInSqFt() && zipCodeFilterCB.getValue().equals(p.getZipCode())){
                    pharmacyTV.getItems().add(p);}
                }
                catch (EOFException e1){
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}