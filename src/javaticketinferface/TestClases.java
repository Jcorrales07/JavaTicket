
package javaticketinferface;

import java.util.Calendar;
import javaticketinferface.SportEvent.Sports;

/**
 *
 * @author Corra
 */
public class TestClases {
    public static void main(String[] args) {
        
        //Test de creacion de un evento deportivo
        SportEvent myEvent = new SportEvent("Partido", "Partido de futbol", Calendar.getInstance(), 3000, "Madrid", "Barca", Sports.FOOTBALL);
        System.out.println(myEvent);
        
        //Prueba para ver los ids de los eventos que se agregan al arraylist del admin
        Admin admin = new Admin("","","",1);
        System.out.println(admin);
        admin.eventIds.add(myEvent);
        int i = 0;
        int id = admin.eventIds.get(i).getId();
        System.out.println(id);
    }
}
