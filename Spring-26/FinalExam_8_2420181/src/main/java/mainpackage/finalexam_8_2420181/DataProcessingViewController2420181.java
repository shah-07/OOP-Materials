package mainpackage.finalexam_8_2420181;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataProcessingViewController2420181
{
    @javafx.fxml.FXML
    private TextField minPriceTF;
    @javafx.fxml.FXML
    private TableColumn<Furniture, Float> priceTC;
    @javafx.fxml.FXML
    private TableColumn<Furniture, Float>discountTC;
    @javafx.fxml.FXML
    private CheckBox importedChB;
    @javafx.fxml.FXML
    private TableColumn<Furniture, Float> vatTC;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private TableColumn<Furniture, String> typeTC;
    @javafx.fxml.FXML
    private TableColumn <Furniture, Boolean>importedTC;
    @javafx.fxml.FXML
    private TableView <Furniture>tableView;
    @javafx.fxml.FXML
    private TableColumn<Furniture, Integer> idTC;
    @javafx.fxml.FXML
    private TableColumn<Furniture, String> descriptionTC;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        typeCB.getItems().addAll("Chair", "Table", "Bed", "Cabinet");

        priceTC.setCellValueFactory(new PropertyValueFactory<>("price"));
        discountTC.setCellValueFactory(new PropertyValueFactory<>("discountPercentage"));
        vatTC.setCellValueFactory(new PropertyValueFactory<>("vatPercentage"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        importedTC.setCellValueFactory(new PropertyValueFactory<>("imported"));
        idTC.setCellValueFactory(new PropertyValueFactory<>("Id"));
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));

    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {

        try{

            FileInputStream fis = new FileInputStream("Furniture.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);


            while(true) {
                try {
                    Furniture f = (Furniture) ois.readObject();

                    if (typeCB.getValue().equals(f.getType()) && f.getPrice() >= Float.parseFloat(minPriceTF.getText()) && importedChB.isSelected() == f.isImported()){
                        tableView.getItems().add(f);
                    }
                }

                catch (EOFException e){
                    break;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("DataCreationView2420181.fxml"));
        Node node = loader.load();
        mainPane.getChildren().setAll(node);

    }
}