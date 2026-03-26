package mainpackage.telemedicineappv2.Doctor;

import mainpackage.telemedicineappv2.User;

import java.io.Serializable;
import java.time.LocalDate;

public class Doctor extends User implements Serializable{

    private String specialized;

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public Doctor(String name, int id, String password, LocalDate dateOfBirth, String specialized) {
        super(name, id, password, dateOfBirth);
        this.specialized = specialized;

    }
}
