package mainpackage.mini_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class LoginPageViewController
{
    @javafx.fxml.FXML
    private TextField userIDTF;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private Label errorMessageLabel;

    ArrayList<User> userList = new ArrayList<>();
    User u1 = new User("Ibrahim", "Male", "1234", 0000, LocalDate.of(2000, 01, 01), "Bashundhara", "+88014752566");
    User u2 = new User("Kawsar", "Male", "5678", 0001, LocalDate.of(2000, 01, 01), "Bashundhara", "+88014752566");
    @javafx.fxml.FXML
    private AnchorPane mainPane;


    @javafx.fxml.FXML
    public void initialize() {
        userList.add(u1);
        userList.add(u2);
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) throws IOException {

        for (User u : userList){
            if (Integer.parseInt(userIDTF.getText()) == u.getId() && passwordPF.getText().equals(u.getPassword())){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DashBoardView.fxml"));
                Node node = fxmlLoader.load();
                DashBoardViewController dashBoardViewController = fxmlLoader.getController();
                dashBoardViewController.setNameAndId(u.getName(), u.getId());
                mainPane.getChildren().setAll(node);
            }
        }
        errorMessageLabel.setText("User id and password doesn't match");
    }
}