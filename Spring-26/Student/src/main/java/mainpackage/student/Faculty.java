package mainpackage.student;

public class Faculty extends User{
    private String designation;
    private int Salary;

    public Faculty(String name, String gender, int id, String designation, int salary) {
        super(name, gender, id);
        this.designation = designation;
        Salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
