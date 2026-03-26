module mainpackage.telemedicineappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jnanoid;
    requires org.apache.commons.lang3;
    requires java.desktop;
    requires kernel;
    requires layout;
    requires jdk.httpserver;

    opens mainpackage.telemedicineappv2 to javafx.fxml;
    exports mainpackage.telemedicineappv2;

    opens mainpackage.telemedicineappv2.Admin to javafx.fxml;
    opens mainpackage.telemedicineappv2.Doctor to javafx.fxml;
    opens mainpackage.telemedicineappv2.Patient to javafx.fxml;

    exports mainpackage.telemedicineappv2.Admin;
    exports mainpackage.telemedicineappv2.Doctor;
    exports mainpackage.telemedicineappv2.Patient;
}