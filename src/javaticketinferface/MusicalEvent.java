package javaticketinferface;

import java.util.Calendar;

public class MusicalEvent extends Event {
    final int AMAX = 25000;
    private Genre musicGenre;
    //SE COBRA UN 30% DE SEGURO, NO SE SI DEBE SER ATRIBUTO
    public enum Genre {
        POP,
        ROCK,
        RAP,
        CLASSIC,
        REGGEATON,
        OTRO
    }
    
    public MusicalEvent() {}
    
    public MusicalEvent(String entTitle, String entDescription, Calendar date, double rentAmount, Genre musicGenre) {
        super(entTitle, entDescription, date, rentAmount);
        this.musicGenre = musicGenre;
    }

    public Genre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(Genre musicGenre) {
        this.musicGenre = musicGenre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("MusicalEvent{ Amount MAX =").append(AMAX);
        sb.append(", Music Genre=").append(musicGenre);
        sb.append('}');
        return sb.toString();
    }
}
