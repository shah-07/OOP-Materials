package mainpackage.checkbox_radiobutton;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.util.ArrayList;

public class Demo
{
    @javafx.fxml.FXML
    private CheckBox hasScholarshipCB;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private RadioButton femaleRB;
    private ArrayList<Student> studentList = new ArrayList<>();
    @javafx.fxml.FXML
    private ToggleGroup genderGroup;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createButtonOA(ActionEvent actionEvent) {

        boolean scholarship = false;

        if (hasScholarshipCB.isSelected()){
            scholarship = true;
        }

        /*
        boolean someValue = false;
        if (someCB.isSelected()){
            someValue = true;
        }
         */

        String gender = "";

        if(maleRB.isSelected()){
            gender = "Male";
        }
        else if (femaleRB.isSelected()){
            gender = "Female";
        }

        Student s = new Student(gender, scholarship);
        studentList.add(s);

        for (Student a: studentList){
            System.out.println(a.toString());
        }

    }
}