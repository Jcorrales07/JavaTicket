package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public class Admin extends User {
    protected ArrayList<Event> eventIds;
    
    public Admin(String name, String username, String password, int edad) {
        super(name, username, password, edad);
        eventIds = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Admin ").append(super.toString());
        //No tiene sentido por ahora
//        sb.append(" Admin { eventIds = ").append(eventIds.size());
//        sb.append('}');
        return sb.toString();
    }

//    public ArrayList<Event> getEventIds() {
//        return eventIds;
//    }
//
//    public void setEventIds(ArrayList<Event> eventIds) {
//        this.eventIds = eventIds;
//    }
}
