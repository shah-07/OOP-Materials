module mainpackage.student_bin {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.student_bin to javafx.fxml;
    exports mainpackage.student_bin;
}