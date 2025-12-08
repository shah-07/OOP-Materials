package mainpackage.final_tutorial;

import java.io.Serializable;
import java.time.LocalDate;

public class Pharmacy extends Shop implements Serializable {

    private String owner, location;
    private boolean chainPharmacy;
    final private LocalDate openingDate;
    final private long tradeNo;

    public Pharmacy(String name, int zipCode, float areaInSqFt, long tradeNo, LocalDate openingDate, boolean chainPharmacy, String location, String owner) {
        super(name, zipCode, areaInSqFt);
        this.tradeNo = tradeNo;
        this.openingDate = openingDate;
        this.chainPharmacy = chainPharmacy;
        this.location = location;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isChainPharmacy() {
        return chainPharmacy;
    }

    public void setChainPharmacy(boolean chainPharmacy) {
        this.chainPharmacy = chainPharmacy;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public long getTradeNo() {
        return tradeNo;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", isChainPharmacy=" + chainPharmacy +
                ", openingDate=" + openingDate +
                ", tradeNo=" + tradeNo +
                '}';
    }

    public void  LicenseFee(){
        if (getAreaInSqFt()>=500){
            System.out.println(getAreaInSqFt()*1000);
        }
        else{
            System.out.println(getAreaInSqFt()*500);
        }
    }

}


