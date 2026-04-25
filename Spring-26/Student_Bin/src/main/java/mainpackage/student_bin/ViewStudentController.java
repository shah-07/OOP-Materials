package mainpackage.student_bin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.time.LocalDate;

public class ViewStudentController
{
    @javafx.fxml.FXML
    private TableColumn<Student, LocalDate> dobTC;
    @javafx.fxml.FXML
    private TableColumn<Student, String> genderTC;
    @javafx.fxml.FXML
    private TableColumn<Student, String> nameTC;
    @javafx.fxml.FXML
    private TableView<Student> studentTV;
    @javafx.fxml.FXML
    private TableColumn<Student, Integer> idTC;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> genderCB;
    @javafx.fxml.FXML

    ObservableList<Student> studentList = FXCollections.observableArrayList();
    public void initialize() {

        genderCB.getItems().addAll("Male", "Female");

        dobTC.setCellValueFactory(new PropertyValueFactory<>("dob"));
        genderTC.setCellValueFactory(new PropertyValueFactory<>("gender"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));

    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateStudentView.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void showObjectsButtonOA(ActionEvent actionEvent) {

        studentTV.getItems().clear();
        studentList = GenericFileManager.readAll(Student.class, "Student.bin");

        for (Student s: studentList){
            if (genderCB.getValue().equals(s.getGender())){
                studentTV.getItems().add(s);
            }
        }

        /*File f = new File("Student.bin");
        FileInputStream fis;
        ObjectInputStream ois;

        try{
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Student s = (Student) ois.readObject();
                    if (genderCB.getValue().equals(s.getGender())){
                        studentTV.getItems().add(s);
                    }
                }
                catch(EOFException e){
                    break;
                }
            }
            messageLabel.setText("Student loaded");
            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

         */
    }

    @javafx.fxml.FXML
    public void deleteButtonOA(ActionEvent actionEvent) {

        //With FIle Manager

        Student selectedStudent = studentTV.getSelectionModel().getSelectedItem();
        studentTV.getItems().remove(selectedStudent);
        studentList.remove(selectedStudent);
        GenericFileManager.writeAll(studentList, "Student.bin");


        /* Without File Manager
        Student selectedStudent = studentTV.getSelectionModel().getSelectedItem();
        studentTV.getItems().remove(selectedStudent);

        try{
            FileOutputStream fos = new FileOutputStream("Student.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Student s : studentTV.getItems()){
                oos.writeObject(s);
            }
           oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

         */
    }

    @javafx.fxml.FXML
    public void editButtonOA(ActionEvent actionEvent) throws IOException{
        Student selectedStudent = studentTV.getSelectionModel().getSelectedItem();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditStudentView.fxml"));
        Node node = loader.load();
        EditStudentViewController nextController = loader.getController();
        nextController.studentToEdit = selectedStudent;
        nextController.setStudent();
        nextController.studentL = studentTV.getItems();
        studentList.remove(selectedStudent);
        GenericFileManager.writeAll(studentList, "Student.bin");
        mainPane.getChildren().setAll(node);
    }
}