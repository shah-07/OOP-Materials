package mainpackage.class2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    private ComboBox<String> eventTypeCB;
    @javafx.fxml.FXML
    private Label outputLabel;

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
        if (c.getEventType().equals("Personal") || c.getId()==200){
            outputLabel.setText(c.toString());
        }


    }
}