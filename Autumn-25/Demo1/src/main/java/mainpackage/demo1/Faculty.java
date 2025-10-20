package mainpackage.demo1;

public class Faculty {
    private String name, designation;
    private int salary, id;

    public Faculty(String name, String designation, int salary, int id) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.id = id;
    }
    public boolean isProfessor (){
        if (this.designation.equals("Professor")){
            return true;
        }
        else{
            return false;
        }
    }

    public void printID (){
        System.out.println(this.id);
    }
}
