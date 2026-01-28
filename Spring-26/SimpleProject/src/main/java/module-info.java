module mainpackage.simpleproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.simpleproject to javafx.fxml;
    exports mainpackage.simpleproject;
}