module mainpackage.sceneswitching {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens mainpackage.sceneswitching to javafx.fxml;
    exports mainpackage.sceneswitching;
}