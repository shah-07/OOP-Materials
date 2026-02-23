module mainpackage.midterm_2420181_sec5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.midterm_2420181_sec5 to javafx.fxml;
    exports mainpackage.midterm_2420181_sec5;
}