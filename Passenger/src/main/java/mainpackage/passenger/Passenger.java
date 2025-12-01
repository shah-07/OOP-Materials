package mainpackage.passenger;

import java.io.Serializable;
import java.time.LocalDate;

public class Passenger implements Serializable {
    final private String name;
    private String email, phoneNumber;
    final private LocalDate doB;

    public Passenger(String name, LocalDate doB, String phoneNumber, String email) {
        this.name = name;
        this.doB = doB;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDoB() {
        return doB;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", doB=" + doB +
                '}';
    }
}
