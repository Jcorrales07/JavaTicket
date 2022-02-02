package javaticketinferface;

/** @author Joe Corrales */
public class LimitedUser extends User {
    public LimitedUser() {}
    
    public LimitedUser(String name, String username, String password, int edad) {
        super(name, username, password, edad);
    } 
}
