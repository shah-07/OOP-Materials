module mainpackage.final_tutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.final_tutorial to javafx.fxml;
    exports mainpackage.final_tutorial;
}