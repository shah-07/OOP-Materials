package mainpackage.student;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class StudentViewController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox <String> genderCB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField addressTF;
    @javafx.fxml.FXML
    private TextField phoneNumberTF;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {

        genderCB.getItems().addAll("Male", "Female");

    }

    Student s;

    @javafx.fxml.FXML
    public void createButtonOA(ActionEvent actionEvent) {

        String name, phoneNumber, address, gender;
        int id;
        LocalDate dob;

        id = Integer.parseInt(idTF.getText());
        name = nameTF.getText();
        phoneNumber = phoneNumberTF.getText();
        address = addressTF.getText();
        gender = genderCB.getValue();
        dob = dobDP.getValue();

        //String name, String phoneNumber, String address, String gender, int id, LocalDate dateOfBirth)
        s = new Student(name, phoneNumber, address, gender, id, dob);
        messageLabel.setText("Student Created Successfully");

        nameTF.clear();
        phoneNumberTF.clear();
        addressTF.clear();
        idTF.clear();
        genderCB.getItems().clear();
        dobDP.setValue(null);
    }

    @javafx.fxml.FXML
    public void showObjectsButtonOA(ActionEvent actionEvent) {

        outputLabel.setText(s.toString());

    }
}