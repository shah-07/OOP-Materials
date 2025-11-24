module mainpackage.class2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mainpackage.class2 to javafx.fxml;
    exports mainpackage.class2;
}