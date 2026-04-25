package mainpackage.student_bin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class CreateStudentViewController
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
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    ObservableList<Student> studentList = FXCollections.observableArrayList();
    ObservableList<Student> list2 = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        genderCB.getItems().addAll("Male", "Female");
        departmentCB.getItems().addAll("CSE", "Pharmacy", "Biochemistry", "Law");

    }

    @javafx.fxml.FXML
    public void createButtonOA(ActionEvent actionEvent) {

        LocalDate l = dobDP.getValue();
        int dobYear = l.getYear();
        int age = LocalDate.now().getYear() - dobYear;

        if (age < 15){
            messageLabel.setText("Age cannot be less than 15");
            return;
        }

        list2  = GenericFileManager.readAll(Student.class, "Student.bin");
        for (Student student : list2){
            if (Integer.parseInt(idTF.getText())==student.getId()){
                messageLabel.setText("ID must be unique");
                return;
            }
        }

        Student s = new Student(
                nameTF.getText(),
                genderCB.getValue(),
                Integer.parseInt(idTF.getText()),
                dobDP.getValue(),
                departmentCB.getValue());

        GenericFileManager.writeAll(studentList, "Student.bin");
        messageLabel.setText("Student created");


        /*
        File f = new File("Student.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream (fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(s);
            oos.close();
            messageLabel.setText("Student added");
        }
        catch (Exception e){
            e.printStackTrace();
        }

         */
    }

    @javafx.fxml.FXML
    public void nextSceneButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewStudent.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}