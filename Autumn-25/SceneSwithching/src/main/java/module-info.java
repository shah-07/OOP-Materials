module mainpackage.sceneswithching {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.sceneswithching to javafx.fxml;
    exports mainpackage.sceneswithching;
}