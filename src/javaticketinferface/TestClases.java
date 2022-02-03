
package javaticketinferface;

import java.util.Date;
import javaticketinferface.SportingEvent.Sports;

/**
 *
 * @author Corra
 */
public class TestClases {
    public static void main(String[] args) {
        SportingEvent myEvent = new SportingEvent(
        "Partido", "Partido de futbol", new Date(), 3000, "Madrid", "Barca", Sports.FOOTBALL);
        
        System.out.println(myEvent);
    }
}
