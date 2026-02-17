package mainpackage.midterm_01_2420181;

import javafx.scene.control.Alert;

import java.time.LocalDate;

public class Advertisement {

    private int advId, clientId;
    private String advType, isForCharity;
    private float billAmount, vatPercent;
    private LocalDate deliveryDate;

    public Advertisement(int advId, int clientId, String advType, String isForCharity, float billAmount, float vatPercent, LocalDate deliveryDate) {
        this.advId = advId;
        this.clientId = clientId;
        this.advType = advType;
        this.isForCharity = isForCharity;
        this.billAmount = billAmount;
        this.vatPercent = vatPercent;
        this.deliveryDate = deliveryDate;
    }

    public int getAdvId() {
        return advId;
    }

    public void setAdvId(int advId) {
        this.advId = advId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getAdvType() {
        return advType;
    }

    public void setAdvType(String advType) {
        this.advType = advType;
    }

    public String getIsForCharity() {
        return isForCharity;
    }

    public void setIsForCharity(String isForCharity) {
        this.isForCharity = isForCharity;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public float getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(float vatPercent) {
        this.vatPercent = vatPercent;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advId=" + advId +
                ", clientId=" + clientId +
                ", advType='" + advType + '\'' +
                ", isForCharity='" + isForCharity + '\'' +
                ", billAmount=" + billAmount +
                ", vatPercent=" + vatPercent +
                ", deliveryDate=" + deliveryDate +
                '}';
    }

    public void showTotalAmountInAlert(){
        float vatAmount;
        if (this.isForCharity.equals("True")){
            vatAmount = 0;
        }
        else{
            vatAmount = this.billAmount * this.vatPercent/100;
        }

        float totalToShowInAlert = this.billAmount + vatAmount;

        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(Float.toString(totalToShowInAlert));
        a.showAndWait();

    }


}
