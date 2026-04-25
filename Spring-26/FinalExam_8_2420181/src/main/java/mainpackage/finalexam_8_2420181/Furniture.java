package mainpackage.finalexam_8_2420181;

import java.io.Serializable;
import java.util.ArrayList;

public class Furniture implements Serializable {
    //fields: ID, description, type, price, discountPercentage, vatPercentage, isImported
    //type: “Chair”, “Table”, “Bed”, “Cabinet”, etc.

    private final int Id;
    private String description, type;
    private float price, discountPercentage, vatPercentage;
    private final boolean imported;

    private ArrayList<String> experienceList;

    public int getId() {
        return Id;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public float getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(float vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public boolean isImported() {
        return imported;
    }

    public Furniture(int id, boolean imported, float vatPercentage, float discountPercentage, float price, String type, String description) {
        Id = id;
        this.imported = imported;
        this.vatPercentage = vatPercentage;
        this.discountPercentage = discountPercentage;
        this.price = price;
        this.type = type;
        this.description = description;


    }

    @Override
    public String toString() {
        return
                "Id: " + Id
                        + "\n" +
                        "Description: " + description
                        + "\n" +
                        "Type: " + type
                        + "\n" +
                        "Price: " + price
                        + "\n" +
                        "DiscountPercentage: " + discountPercentage
                        + "\n" +
                        "VatPercentage: " + vatPercentage
                        + "\n" +
                        "Imported: " + imported
                ;
    }

    public float getBillAmount(){
        float discountPercentageOnPrice = price * discountPercentage;
        float vatPercentageCalculate = (price - discountPercentageOnPrice) * vatPercentage;
        float billAmount = price - discountPercentageOnPrice + vatPercentageCalculate;
        return billAmount;
    }
}
