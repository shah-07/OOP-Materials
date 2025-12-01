package mainpackage.passenger;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreatePassengerController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField phoneNumberTF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private AnchorPane anchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void nextButtonOA(ActionEvent actionEvent) throws IOException {

        Node node = FXMLLoader.load(getClass().getResource("loadPassengerView.fxml"));
        anchorPane.getChildren().setAll(node);

    }

    @javafx.fxml.FXML
    public void createPassengerOA(ActionEvent actionEvent) {

        try {
            File f = new File("Passenger.bin");
            if (f.exists()){
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(new Passenger(nameTF.getText(),
                        dobDP.getValue(),
                        phoneNumberTF.getText(),
                        emailTF.getText()));
                messageLabel.setText("Passenger Created");
                nameTF.clear();
                oos.close();
            }
            else{
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(new Passenger(nameTF.getText(),
                        dobDP.getValue(),
                        phoneNumberTF.getText(),
                        emailTF.getText()));
                messageLabel.setText("Passenger Created");
                nameTF.clear();
                oos.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}