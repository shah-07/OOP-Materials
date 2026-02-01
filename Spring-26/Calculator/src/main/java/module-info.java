module mainpackage.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.calculator to javafx.fxml;
    exports mainpackage.calculator;
}