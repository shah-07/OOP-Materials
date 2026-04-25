package mainpackage.student_bin;

import java.io.Serializable;
import java.time.LocalDate;

public class Student extends User implements Serializable {

    private String department;

    public Student(String name, String gender, int id, LocalDate dob, String department) {
        super(name, gender, id, dob);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "Department: " + department
                ;
    }
}
