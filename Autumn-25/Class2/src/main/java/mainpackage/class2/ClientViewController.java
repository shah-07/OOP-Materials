package mainpackage.class2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    private Label outputLabel;
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
        /*if (c.getEventType().equals("Personal") || c.getId()==200){
            outputLabel.setText(c.toString());
        }*/

        //One liner:
        //clientList.add(new Client(nameTF.getText(), eventTypeCB.getValue(), Integer.parseInt(idTF.getText()), addressTF.getText(), dateOFEventDP.getValue()));


    }

    @javafx.fxml.FXML
    public void showClientsButtonOA(ActionEvent actionEvent) {

        for (Client x: clientList){
            if(x.getEventType().equals("Personal")){
                System.out.println(x.toString());
            }
        }


    }
}