package mainpackage.checkbox_radiobutton;

public class Student {
    private String gender;
    private boolean hasScholarship;

    public Student(String gender, boolean hasScholarship) {
        this.gender = gender;
        this.hasScholarship = hasScholarship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", hasScholarship=" + hasScholarship +
                '}';
    }
}
