module mainpackage.midterm_01_2420181 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.midterm_01_2420181 to javafx.fxml;
    exports mainpackage.midterm_01_2420181;
}