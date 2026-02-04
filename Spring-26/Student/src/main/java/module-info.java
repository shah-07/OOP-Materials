module mainpackage.student {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.student to javafx.fxml;
    exports mainpackage.student;
}