module mainpackage.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.demo1 to javafx.fxml;
    exports mainpackage.demo1;
}