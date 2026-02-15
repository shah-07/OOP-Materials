package mainpackage.student;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("studentView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        Student a = new Student("+8801782456", "Sah Paran", "Bashundhara", "Male", 2420181, LocalDate.of(2000, 5, 7));
        //System.out.println(a.toString());
        System.out.println(a.getGender().equals("Male"));
    }

    public static void main(String[] args) {
        launch();
    }
}