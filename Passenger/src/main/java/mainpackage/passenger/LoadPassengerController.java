package mainpackage.passenger;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class LoadPassengerController
{
    @javafx.fxml.FXML
    private TableView<Passenger> passengerTV;
    @javafx.fxml.FXML
    private TableColumn<Passenger, String> nameTF;
    @javafx.fxml.FXML
    private TableColumn<Passenger, LocalDate> dobTC;
    @javafx.fxml.FXML
    private TableColumn<Passenger, String> emailTC;
    @javafx.fxml.FXML
    private TableColumn<Passenger, String> phoneNumberTC;
    @javafx.fxml.FXML
    private AnchorPane anchorPane;
    @javafx.fxml.FXML
    private TextField filterNameTF;

    @javafx.fxml.FXML
    public void initialize() {

        nameTF.setCellValueFactory(new PropertyValueFactory<>("name"));
        dobTC.setCellValueFactory(new PropertyValueFactory<>("doB"));
        phoneNumberTC.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        emailTC.setCellValueFactory(new PropertyValueFactory<>("email"));

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        Node node = FXMLLoader.load(getClass().getResource("createPassengerView.fxml"));
        anchorPane.getChildren().setAll(node);

    }

    @javafx.fxml.FXML
    public void loadPassengerOA(ActionEvent actionEvent) {

        passengerTV.getItems().clear();

        try {
            FileInputStream fis = new FileInputStream("Passenger.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Passenger p = (Passenger) ois.readObject();
                    if (p.getName().equals(filterNameTF.getText())){
                        passengerTV.getItems().add(p);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}