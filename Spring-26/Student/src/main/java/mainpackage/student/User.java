package mainpackage.student;

public abstract class User {
    private String name, gender;
    private int id;

    public User(String name, String gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    private void login(String pass, String userID){
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
