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
    private TextField clientIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> adTypeCB;
    @javafx.fxml.FXML
    private TextField billAmountTF;
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
    private TextField clientIdForFilterTF;

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

        int count = 0;
        for (Advertisement a : adTV.getItems()){
            if(a.getIsForCharity().equals("True")){
                count++;
            }
        }
        String countStr = Integer.toString(count);
        outputLabel.setText("Number of advertisement for charity is: "+countStr);

    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {

        adTV.getItems().clear();

        //adTV.getItems().addAll(adList); 5marks (Without filtering)
        for (Advertisement a: adList){
            if(adTypeFilterCB.getValue().equals(a.getAdvType()) && Integer.parseInt(clientIdForFilterTF.getText()) == a.getClientId()){
                adTV.getItems().add(a);
            }
        }


    }

    @javafx.fxml.FXML
    public void addAdvertisementButtonOA(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.ERROR);

        if (deliveryDateDP.getValue().isBefore(LocalDate.now())){
            alert.setContentText("Delivery cannot be previous date");
            alert.showAndWait();
        }

        float vatPercent = 0;
        if (forCharityCB.getValue().equals("True")){
            vatPercent = 0;
        }
        else if (forCharityCB.getValue().equals("False") && adTypeCB.getValue().equals("Print")){
            vatPercent = 5;
        }
        else if ((forCharityCB.getValue().equals("False")) &&
                (adTypeCB.getValue().equals("Audio")||adTypeCB.getValue().equals("Video"))){
            vatPercent = 10;
        }
        else if (forCharityCB.getValue().equals("False") && adTypeCB.getValue().equals("BillBoard")){
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

        adList.add(a);
    }
}