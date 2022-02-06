package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public class User {
    protected static ArrayList<User> users = new ArrayList<>();
    protected int id;
    protected static int counter;
    protected String name;
    protected String username;
    protected String password;
    protected int age;
    
    public User() {}

    public User(String name, String username, String password, int age) {
        this.id = ++User.counter;
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ \nNumber Id = ").append(this.id);
        sb.append(", \nName = '").append(this.name);
        sb.append(", \nUsername = '").append(this.username);
        sb.append(", \nPassword = '").append(this.password);
        sb.append(", \nAge = ").append(this.age).append(" \n}");
        return sb.toString();
    }
}
