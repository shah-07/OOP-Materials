package mainpackage.class2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class ClientViewController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextArea addressTF;
    @javafx.fxml.FXML
    private DatePicker dateOFEventDP;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private ComboBox <String> eventTypeCB;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private AnchorPane anchorPane;

    ArrayList<Client> clientList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        eventTypeCB.getItems().addAll("Business", "Personal", "Social", "Charity");

    }

    @javafx.fxml.FXML
    public void createClientInstanceOA(ActionEvent actionEvent) {



        Client c = new Client(nameTF.getText(), eventTypeCB.getValue(), Integer.parseInt(idTF.getText()), addressTF.getText(), dateOFEventDP.getValue());
        //System.out.println(c.toString());
        //outputLabel.setText(c.toString());
        /*if (c.getEventType().equals("Personal") && c.getId()==200){
            /outputLabel.setText(c.toString());
        }*/
        clientList.add(c);
        messageLabel.setText("Client created successfully");
        /*if (c.getEventType().equals("Personal") || c.getId()==200){
            outputLabel.setText(c.toString());
        }*/

        //One liner:
        //clientList.add(new Client(nameTF.getText(), eventTypeCB.getValue(), Integer.parseInt(idTF.getText()), addressTF.getText(), dateOFEventDP.getValue()));


    }

    @javafx.fxml.FXML
    public void nextPageButtonOA(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NextPageView.fxml"));
            Node node = loader.load();
            NextPageController nextPage = loader.getController();
            nextPage.clientList2.addAll(clientList);
            nextPage.setTableView();
            anchorPane.getChildren().setAll(node);
        }
        catch(Exception e){
            //
        }


    }
}