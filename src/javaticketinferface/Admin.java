package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public class Admin extends User {
    //Class atributes
    protected ArrayList<Event> eventIds;
    
    //Constructors
    public Admin() {}
    
    public Admin(String name, String username, String password, int edad) {
        super(name, username, password, edad);
        eventIds = new ArrayList<>();
    }

    //toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Admin ").append(super.toString());
        sb.append(" \nEvent Ids = ").append(eventIds.size());
        sb.append(" \n}");
        return sb.toString();
    }
}
