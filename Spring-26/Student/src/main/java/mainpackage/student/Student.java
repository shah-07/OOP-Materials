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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
