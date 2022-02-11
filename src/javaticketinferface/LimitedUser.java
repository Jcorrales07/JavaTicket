package javaticketinferface;

/** @author Joe Corrales */
public class LimitedUser extends User {
    public LimitedUser(String name, String username, String password, int edad) {
        super(name, username, password, edad);
    } 
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LimitedUser ").append(super.toString()).append(" \n}");
        return sb.toString();
    }
}
