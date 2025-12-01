module mainpackage.passenger {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.passenger to javafx.fxml;
    exports mainpackage.passenger;
}