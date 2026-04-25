package mainpackage.student_bin;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EditStudentViewController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox<String> genderCB;
    @javafx.fxml.FXML
    private TextField addressTF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private Label messageLabel;

    Student studentToEdit;
    ObservableList<Student> studentL;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        genderCB.getItems().addAll("Male", "Female");
        departmentCB.getItems().addAll("CSE", "Pharmacy", "Biochemistry", "Law");

    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewStudent.fxml"));
        Node node = loader.load();
        mainPane.getChildren().setAll(node);
    }

    @javafx.fxml.FXML
    public void editStudentButtonOA(ActionEvent actionEvent) {

        Student s = new Student(nameTF.getText(),
                genderCB.getValue(),
                Integer.parseInt(idTF.getText()),
                dobDP.getValue(),
                departmentCB.getValue());


        GenericFileManager.append(s, "Student.bin");
        messageLabel.setText("Student information updated");

    }

    public void setStudent(){
        nameTF.setText(studentToEdit.getName());
        departmentCB.setValue(studentToEdit.getDepartment());
        idTF.setText(Integer.toString(studentToEdit.getId()));
        genderCB.setValue(studentToEdit.getGender());
        dobDP.setValue(studentToEdit.getDob());
    }
}