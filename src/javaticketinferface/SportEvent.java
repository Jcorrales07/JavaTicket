package javaticketinferface;

import java.util.ArrayList;

/** @author Joe Corrales */
public final class SportEvent extends Event {
    //Class attributes
    private final int AMAX = 20000; 
    private String team1;
    private String team2;
    private Sports sportType;
    private ArrayList<String> tplayers1;
    private ArrayList<String> tplayers2;
    
    //Class enumeration
    public enum Sports {
        FOOTBALL, TENNIS, RUGBY, BASEBALL,
    }
    
    //Constructors
    public SportEvent() {}
    
    public SportEvent(int id, String title, String desc, int year, int month, int day, double rentAmount, String team1, String team2, Sports sportType) {
        super(id, title, desc, year, month, day, rentAmount);
        this.team1 = team1;
        this.team2 = team2;
        this.sportType = sportType;
        this.tplayers1 = new ArrayList<>();
        this.tplayers2 = new ArrayList<>();
    }

    //Getters and setters
    public final String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public final String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public final Sports getSportType() {
        return sportType;
    }

    public void setSportType(Sports sportType) {
        this.sportType = sportType;
    }

    public final ArrayList<String> getTplayers1() {
        return tplayers1;
    }

    public void setTplayers1(ArrayList<String> tplayers1) {
        this.tplayers1 = tplayers1;
    }

    public final ArrayList<String> getTplayers2() {
        return tplayers2;
    }

    public void setTplayers2(ArrayList<String> tplayers2) {
        this.tplayers2 = tplayers2;
    }

    //toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SportingEvent { ");
        sb.append(super.toString());
        sb.append(", \t\nTeam 1: ").append(this.team1);
        sb.append(", \t\nTeam 2: ").append(this.team2);
        sb.append(", \t\nSport Type: ").append(this.sportType);
        sb.append(", \t\nCharge: ").append(showInfo());
        sb.append("\n}");
        return sb.toString();
    }
}
