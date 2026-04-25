module mainpackage.finalexam_8_2420181 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mainpackage.finalexam_8_2420181 to javafx.fxml;
    exports mainpackage.finalexam_8_2420181;
}