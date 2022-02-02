package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public class ContentUser extends User {
    //String por ahora, creo que seria un ArrayList de tipo EVENTO
    private ArrayList<String> eventIds;
    public ContentUser() {}
    
    public ContentUser(String name, String username, String password, int edad) {
        super(name, username, password, edad);
        eventIds = new ArrayList<>();
    }  

    
    //No estoy seguro si es asi, pero el ADMIN y CONTENT USER tienen un arraylist para guardar los ids. ese es el intento
    public ArrayList<String> getEventIds() {
        return eventIds;
    }

    public void setEventIds(ArrayList<String> eventIds) {
        this.eventIds = eventIds;
    }
    
    
}
