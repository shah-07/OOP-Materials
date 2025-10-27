package mainpackage.midterm_5_2420181;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class PackageViewController
{
    @javafx.fxml.FXML
    private TableColumn <DataPackage, Float> priceTC;
    @javafx.fxml.FXML
    private ComboBox<String> availibilityCB;
    @javafx.fxml.FXML
    private Label messagaLabel;
    @javafx.fxml.FXML
    private TableView <DataPackage> packageTV;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField priceTF;
    @javafx.fxml.FXML
    private TableColumn<DataPackage, String> nameTC;
    @javafx.fxml.FXML
    private ComboBox<String> validityCB;
    @javafx.fxml.FXML
    private TableColumn<DataPackage, LocalDate> offerEndsTC;
    @javafx.fxml.FXML
    private TableColumn<DataPackage, String> availibilityTC;
    @javafx.fxml.FXML
    private TableColumn<DataPackage, Float> dataAmountTC;
    @javafx.fxml.FXML
    private TextField dataAmountTF;
    @javafx.fxml.FXML
    private TableColumn<DataPackage, String> validityTC;
    @javafx.fxml.FXML
    private DatePicker offerEndsDP;

    ArrayList<DataPackage> dataPackageList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        validityCB.getItems().addAll("3 days", "7 days", "15 days", "30 days", "Unlimited");
        availibilityCB.getItems().addAll("App only", "Recharge only", "App and Recharge");

        priceTC.setCellValueFactory(new PropertyValueFactory<>("price"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("packageName"));
        availibilityTC.setCellValueFactory(new PropertyValueFactory<>("availability"));
        validityTC.setCellValueFactory(new PropertyValueFactory<>("validity"));
        dataAmountTC.setCellValueFactory(new PropertyValueFactory<>("dataAmount"));
        offerEndsTC.setCellValueFactory(new PropertyValueFactory<>("offerEnds"));

    }

    @javafx.fxml.FXML
    public void bestValuePackageButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetFilterButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createPackageButtonOA(ActionEvent actionEvent) {

        //part-a
        if (nameTF.getText().isEmpty() || dataAmountTF.getText().isEmpty() || validityCB.getValue().isEmpty() || priceTF.getText().isEmpty() || availibilityCB.getValue().isEmpty() || offerEndsDP.getValue() == null){
            messagaLabel.setText("All fields need to be filed");
            return;
        }

        //part-b
        String name = nameTF.getText();
        for (DataPackage packages : dataPackageList){
            if (name.equals(packages.getPackageName())){
                messagaLabel.setText("Already name exists, name must be unique");
                return;
            }
        }
        //part-c
        dataPackageList.add(new DataPackage(
                nameTF.getText(),
                validityCB.getValue(),
                availibilityCB.getValue(),
                Float.parseFloat(dataAmountTF.getText()),
                Float.parseFloat(priceTF.getText()),
                offerEndsDP.getValue()));

    }
}