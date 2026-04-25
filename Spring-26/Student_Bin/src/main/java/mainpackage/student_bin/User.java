package mainpackage.student_bin;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {

    private final String name, gender;
    private final int id;
    private final LocalDate dob;

    public User(String name, String gender, int id, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }
}
