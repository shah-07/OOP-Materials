package mainpackage.student;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentViewController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox <String> genderCB;
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
    private TableColumn<Student, LocalDate> dobTC;
    @javafx.fxml.FXML
    private TableColumn <Student, String>genderTC;
    @javafx.fxml.FXML
    private TableColumn <Student, String> nameTC;
    @javafx.fxml.FXML
    private TableView <Student> studentTV;
    @javafx.fxml.FXML
    private TableColumn<Student, Integer> idTC;  //int -> Primitive type ; Integer -> Wrapper Class
    @javafx.fxml.FXML
    private ComboBox<String> genderCBForFiltering;
    @javafx.fxml.FXML
    private TextField areaTFForFiltering;

    @javafx.fxml.FXML
    public void initialize() {

        genderCB.getItems().addAll("Male", "Female");
        genderCBForFiltering.getItems().addAll("Male", "Female");

        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        genderTC.setCellValueFactory(new PropertyValueFactory<>("gender"));
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        dobTC.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));


    }

    Student s;
    ArrayList<Student> studentList= new ArrayList<>();

    @javafx.fxml.FXML
    public void createButtonOA(ActionEvent actionEvent) {

        String name, phoneNumber, address, gender;
        int id;
        LocalDate dob;
/*
        id = Integer.parseInt(idTF.getText());
        name = nameTF.getText();
        phoneNumber = phoneNumberTF.getText();
        address = addressTF.getText();
        gender = genderCB.getValue();
        dob = dobDP.getValue();

 */

        //String name, String phoneNumber, String address, String gender, int id, LocalDate dateOfBirth)
        s = new Student(
                nameTF.getText(),
                phoneNumberTF.getText(),
                addressTF.getText(),
                genderCB.getValue(),
                Integer.parseInt(idTF.getText()),
                dobDP.getValue());

        studentList.add(s);
        messageLabel.setText("Student Added Successfully");

        /*
        if (s.getGender().equals("Female")){
            studentList.add(s);
            messageLabel.setText("Student Created Successfully");
        }
        else{
            messageLabel.setText("Student is not Female");
        }*/

        nameTF.clear();
        phoneNumberTF.clear();
        addressTF.clear();
        idTF.clear();
        genderCB.setValue(null);
        dobDP.setValue(null);

    }

    @javafx.fxml.FXML
    public void showObjectsButtonOA(ActionEvent actionEvent) {

        studentTV.getItems().clear();

        for (Student s : studentList){
            if ((s.getGender().equals(genderCBForFiltering.getValue())) && (s.getAddress().equals(areaTFForFiltering.getText()))){
                studentTV.getItems().add(s);
            }


        }
        //Directly shows all the object without filtering
        //studentTV.getItems().addAll(studentList);

    }
}