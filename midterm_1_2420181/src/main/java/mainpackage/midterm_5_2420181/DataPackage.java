package mainpackage.midterm_5_2420181;

import java.time.LocalDate;

public class DataPackage {

    private String packageName, validity, availability;
    private float dataAmount;
    private float price;
    private LocalDate offerEnds;



    public void setValidity(String validity) {
        this.validity = validity;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    public void setOfferEnds(LocalDate offerEnds) {
        this.offerEnds = offerEnds;
    }



    public String getPackageName() {
        return packageName;
    }

    public String getValidity() {
        return validity;
    }

    public String getAvailability() {
        return availability;
    }


    public float getPrice() {
        return price;
    }

    public LocalDate getOfferEnds() {
        return offerEnds;
    }

    public DataPackage(String packageName, String validity, String availability, float dataAmount, float price, LocalDate offerEnds) {
        this.packageName = packageName;
        this.validity = validity;
        this.availability = availability;
        this.dataAmount = dataAmount;
        this.price = price;
        this.offerEnds = offerEnds;
    }

    public float getDataAmount() {
        return dataAmount;
    }

    public void setDataAmount(float dataAmount) {
        this.dataAmount = dataAmount;
    }

    @Override
    public String toString() {
        return "DataPackage{" +
                "packageName='" + packageName + '\'' +
                ", validity='" + validity + '\'' +
                ", availability='" + availability + '\'' +
                ", dataAmount=" + dataAmount +
                ", price=" + price +
                ", offerEnds=" + offerEnds +
                '}';
    }
}
