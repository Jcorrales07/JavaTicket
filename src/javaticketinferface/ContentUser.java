package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public class ContentUser extends User {
    protected ArrayList<Event> eventIds;
    
    public ContentUser(String name, String username, String password, int edad) {
        super(name, username, password, edad);
        this.eventIds = new ArrayList<>();
    }  

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentUser ").append(super.toString());
        return sb.toString();
    }
    
    //No estoy seguro si es asi, pero el ADMIN y CONTENT USER tienen un arraylist para guardar los ids. ese es el intento
//    public ArrayList<Event> getEventIds() {
//        return eventIds;
//    }
//
//    public void setEventIds(ArrayList<Event> eventIds) {
//        this.eventIds = eventIds;
//    }
}
