package mainpackage.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        Faculty f1 = new Faculty ("X", "Professor", 150000, 4501);
        Faculty f2 = new Faculty("Y", "Lecturer", 75000, 4612);
        System.out.println(f1.isProfessor());
        System.out.println(f2.isProfessor());
        f1.printID();
        f2.printID();

    }

    public static void main(String[] args) {
        launch();
    }
}