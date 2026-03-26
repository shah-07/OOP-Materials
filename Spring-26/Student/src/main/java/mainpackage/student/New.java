package mainpackage.student;

import java.time.LocalDate;

public class New {
    String name, phoneNumber, address, gender;
    int id;
    LocalDate dateOfBirth;

    public New(String name, String phoneNumber, String address, String gender, int id, LocalDate dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return
                "Name: " + name
                        + "\n" +
                        "PhoneNumber: " + phoneNumber
                        + "\n" +
                        "Address: " + address
                        + "\n" +
                        "Gender: " + gender
                        + "\n" +
                        "Id: " + id
                        + "\n" +
                        "DateOfBirth: " + dateOfBirth
                ;
    }
}
