package eladgu.cyclebud2.module;

public class User {
    String name;
    int ID;
    int age;

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
