package mainpackage.student_bin;

import java.time.LocalDate;

public class Faculty extends User {
    private String designation;
    private float salary;

    public Faculty(String name, String gender, int id, LocalDate dob, String designation, float salary) {
        super(name, gender, id, dob);
        this.designation = designation;
        this.salary = salary;
    }
}
