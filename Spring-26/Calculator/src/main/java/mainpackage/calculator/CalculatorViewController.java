package mainpackage.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorViewController
{
    @javafx.fxml.FXML
    private TextField aTF;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField bTF;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void multButtonOA(ActionEvent actionEvent) {

        String aStr = aTF.getText();
        String bStr = bTF.getText();

        int aInt = Integer.parseInt(aStr);
        int bInt = Integer.parseInt(bStr);

        int resultInt = aInt * bInt;

        String resultStr = Integer.toString(resultInt);
        outputLabel.setText(aStr+"x"+bStr+" = "+resultStr);

        messageLabel.setText("Multiplication done successfully");


        aTF.clear();
        bTF.clear();

    }

    @javafx.fxml.FXML
    public void addButtonOA(ActionEvent actionEvent) {

        String aStr = aTF.getText(); //20+30 2030
        String bStr = bTF.getText();

        int aInt = Integer.parseInt(aStr);
        int bInt = Integer.parseInt(bStr);

        int resultInt = aInt + bInt;
        String resultStr = Integer.toString(resultInt);
        outputLabel.setText(aStr+"+"+bStr+" = "+resultStr);

        messageLabel.setText("Addition done");


    }

    @javafx.fxml.FXML
    public void divButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void subButtonOA(ActionEvent actionEvent) {
    }
}