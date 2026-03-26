package mainpackage.student;

import java.time.LocalDate;

public class Student {

    String name, phoneNumber, address, gender;
    int id;
    LocalDate dateOfBirth;

    public Student(String name, String phoneNumber, String address, String gender, int id, LocalDate dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Address: " + address + '\n' +
                "Gender: " + gender + '\n' +
                "ID: " + id + '\n' +
                "Date Of Birth: " + dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
