module mainpackage.characterwriting {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mainpackage.characterwriting to javafx.fxml;
    exports mainpackage.characterwriting;
}