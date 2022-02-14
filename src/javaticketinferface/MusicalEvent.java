package javaticketinferface;

import java.util.ArrayList;

public class MusicalEvent extends Event {
    //Class attributes
    final int AMAX = 25000;
    private Genre musicGenre;
    private double thirty = rentAmount * 0.30;
    private double total = rentAmount + thirty;
    private ArrayList<String> mTeam;
    
    //Class' enumeration
    public enum Genre {
        POP, ROCK, RAP, CLASSIC, REGGEATON, OTHER,
    }
    
    //Constructors
    public MusicalEvent() {}
    
    public MusicalEvent(int id, String title, String desc, int year, int month, int day, double rentAmount, Genre musicGenre) {
        super(id, title, desc, year, month, day, rentAmount);
        this.musicGenre = musicGenre;
        this.mTeam = new ArrayList<>();
    }

    //Getters and setters
    public Genre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(Genre musicGenre) {
        this.musicGenre = musicGenre;
    }

    //toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MusicalEvent {");
        sb.append(super.toString());
        sb.append(", \t\n30% of grass insurance: ").append(this.thirty).append("$");
        sb.append(", \t\nTotal amount: ").append(this.total).append("$");
        sb.append(", \t\nMaximum capacity: ").append(this.AMAX).append(" people");
        sb.append(", \t\nMusic Genre: ").append(this.musicGenre);
        sb.append(", \t\nCharge: ").append(showInfo());
        sb.append("\n}");
        return sb.toString();
    }
}
