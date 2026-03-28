package mainpackage.mini_project;

import java.time.LocalDate;

public class User {

    private final String name, gender, password;
    private final int id;
    private String mobileNumber, address;
    private final LocalDate dob;

    public User(String name, String gender, String password, int id, LocalDate dob, String address, String mobileNumber) {
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.id = id;
        this.dob = dob;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return
                "Name: " + name
                        + "\n" +
                        "Gender: " + gender
                        + "\n" +
                        "Password: " + password
                        + "\n" +
                        "Id: " + id
                        + "\n" +
                        "MobileNumber: " + mobileNumber
                        + "\n" +
                        "Address: " + address
                        + "\n" +
                        "Dob: " + dob
                ;
    }
}
