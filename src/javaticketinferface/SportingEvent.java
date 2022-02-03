
package javaticketinferface;

import java.util.Date;

/** @author Joe Corrales */
public class SportingEvent extends Event {
    private String team1;
    private String team2;
    //Se tiene que pedir un tipo de deporte
    private Sports sportType;
    
    //No se si deberia ir ahi
    public enum Sports {
        FOOTBALL,
        TENIS,
        RUGBY,
        BASEBALL
    }
    
    public SportingEvent() {}
    
    public SportingEvent(String entTitle, String entDescription, Date date, double rentAmount, String team1, String team2, Sports sportType) {
        super(entTitle, entDescription, date, rentAmount);
        this.team1 = team1;
        this.team2 = team2;
        this.sportType = sportType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("SportingEvent{ team1=").append(team1);
        sb.append(", team2=").append(team2);
        sb.append(", sportType=").append(sportType);
        sb.append('}');
        return sb.toString();
    }
}
