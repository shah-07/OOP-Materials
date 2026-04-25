package mainpackage.characterwriting;

import java.io.Serializable;

public class Car implements Serializable {
    String model, engineNumber;
    int licenceNumber;

    public Car(String model, String engineNumber, int licenceNumber) {
        this.model = model;
        this.engineNumber = engineNumber;
        this.licenceNumber = licenceNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    @Override
    public String toString() {
        return
                "Model: " + model
                        + "\n" +
                        "EngineNumber: " + engineNumber
                        + "\n" +
                        "LicenceNumber: " + licenceNumber
                ;
    }
}
