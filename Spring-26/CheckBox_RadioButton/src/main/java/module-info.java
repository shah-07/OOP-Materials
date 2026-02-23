module mainpackage.checkbox_radiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.checkbox_radiobutton to javafx.fxml;
    exports mainpackage.checkbox_radiobutton;
}