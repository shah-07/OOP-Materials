package mainpackage.characterwriting;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.io.*;
import java.util.ArrayList;

public class Page2Controller
{
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    ArrayList<Car> carList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewButtonOA(ActionEvent actionEvent) {

        File f = new File("some.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            String s = dis.readUTF();
            dis.close();
            outputLabel.setText(s);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        File f1 = new File("Car.bin");
        try {

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                try {
                    Car c = (Car) ois.readObject();
                    carList.add(c);
                } catch (EOFException e) {
                    break;
                }
            }
            ois.close();

            Car c = carList.getFirst();
            //outputLabel.setText(c.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("textView.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}