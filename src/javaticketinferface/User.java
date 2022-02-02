package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public class User {
    protected static ArrayList<User> users = new ArrayList<>();
    protected String name;
    protected String username;
    protected String password;
    protected int edad;
    
    public User() {}

    public User(String name, String username, String password, int edad) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
