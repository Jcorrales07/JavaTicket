package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public class ContentUser extends User {
    //Class atributes
    protected ArrayList<Event> eventIds;
    
    //Constructors
    public ContentUser() {}
    
    public ContentUser(String name, String username, String password, int edad) {
        super(name, username, password, edad);
        this.eventIds = new ArrayList<>();
    }  

    //Getters and setters
    public ArrayList<Event> getEventIds() {
        return eventIds;
    }

    public void setEventIds(ArrayList<Event> eventIds) {
        this.eventIds = eventIds;
    }
    
    //toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentUser ").append(super.toString());
        sb.append(", \nEvents created: ").append(eventIds.size());
        return sb.toString();
    }
}
