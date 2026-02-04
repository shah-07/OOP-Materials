package mainpackage.student;

public class Student {

    String name, phoneNumber, address, gender;
    int id;

    public Student(String phoneNumber, String name, String address, String gender, int id) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id;
    }
}
