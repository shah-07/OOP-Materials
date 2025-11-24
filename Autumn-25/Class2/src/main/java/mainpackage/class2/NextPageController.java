package mainpackage.class2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import java.util.ArrayList;

public class NextPageController
{
    @javafx.fxml.FXML
    private TableView<Client> clientTable;
    @javafx.fxml.FXML
    private TableColumn<Client, String> addressTC;
    @javafx.fxml.FXML
    private TableColumn<Client, String> nameTC;
    @javafx.fxml.FXML
    private TableColumn<Client, Integer> idTC;
    @javafx.fxml.FXML
    private TableColumn<Client, LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<Client, String> eventTypeTC;
    @javafx.fxml.FXML
    private AnchorPane anchorPane;

    ArrayList<Client> clientList2 = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressTC.setCellValueFactory(new PropertyValueFactory<>("address"));
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("dateOfEvent"));
        eventTypeTC.setCellValueFactory(new PropertyValueFactory<>("eventType"));

    }

    @javafx.fxml.FXML
    public void showClientButtonOA(ActionEvent actionEvent) {

        clientTable.getItems().addAll(clientList2);
    }
    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("clientView.fxml"));
            Node node = loader.load();
            anchorPane.getChildren().setAll(node);
        }
        catch(Exception e){
            //
        }

    }

    public void setTableView (){
        clientTable.getItems().addAll(clientList2);
    }


}