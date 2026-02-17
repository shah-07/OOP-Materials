package mainpackage.midterm_01_2420181;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class AdvertisementViewController
{
    @javafx.fxml.FXML
    private ComboBox <String> forCharityCB;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TextField forCharityFilterTF;
    @javafx.fxml.FXML
    private TextField clientIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> adTypeCB;
    @javafx.fxml.FXML
    private TextField billAmountTF;
    @javafx.fxml.FXML
    private TextField vatPercentTF;
    @javafx.fxml.FXML
    private ComboBox<String> adTypeFilterCB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField adIdTF;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, Integer> adIdTC;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, Integer> clientIDTC;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, Float> billAmountTC;
    @javafx.fxml.FXML
    private TableView<Advertisement> adTV;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, LocalDate> deliveryDateTC;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, String> adTypeTC;

    ArrayList<Advertisement> adList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        adTypeCB.getItems().addAll("Print", "Audio", "Video", "BillBoard");
        adTypeFilterCB.getItems().addAll("Print", "Audio", "Video", "BillBoard");
        forCharityCB.getItems().addAll("True", "False");

        adIdTC.setCellValueFactory(new PropertyValueFactory<>("advId"));
        clientIDTC.setCellValueFactory(new PropertyValueFactory<>("clientId"));
        billAmountTC.setCellValueFactory(new PropertyValueFactory<Advertisement, Float>("billAmount"));
        deliveryDateTC.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        adTypeTC.setCellValueFactory(new PropertyValueFactory<>("advType"));

    }

    @javafx.fxml.FXML
    public void processButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addAdvertisementButtonOA(ActionEvent actionEvent) {

       LocalDate currentDate = LocalDate.now();

       if(deliveryDateDP.getValue().isBefore(currentDate)){
           Alert a = new Alert(Alert.AlertType.ERROR);
           a.setContentText("Delivery Date cannot be previous date");
           a.showAndWait();
           return;
       }

        float vatPercent = 0;

        if(forCharityCB.getValue().equals("True")){
            vatPercent = 0;
        }
        else if ((forCharityCB.getValue().equals("False")) && (adTypeCB.getValue().equals("Print"))){
            vatPercent = 5;
        }
        else if ((forCharityCB.getValue().equals("False")) && (adTypeCB.getValue().equals("Video") || adTypeCB.getValue().equals("Audio"))){
            vatPercent = 10;
        }
        else if((forCharityCB.getValue().equals("False")) && (adTypeCB.getValue().equals("BillBoard"))) {
            vatPercent = 15;
        }

        Advertisement a = new Advertisement(
                Integer.parseInt(adIdTF.getText()),
                Integer.parseInt(clientIdTF.getText()),
                adTypeCB.getValue(),
                forCharityCB.getValue(),
                Float.parseFloat(billAmountTF.getText()),
                vatPercent,
                deliveryDateDP.getValue()
                );
    }
}