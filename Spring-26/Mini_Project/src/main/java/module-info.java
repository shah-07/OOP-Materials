module mainpackage.mini_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mainpackage.mini_project to javafx.fxml;
    exports mainpackage.mini_project;
}