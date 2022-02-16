package javaticketinferface;

import java.util.Date;


/** @author Joe Corrales */
public class ReligiousEvent extends Event {
    //Class Attributes
    private final int AMAX = 30000;
    private final int FIXEDAMOUNT = 2000;
    private final double TOTAL_AMOUNT = rentAmount + FIXEDAMOUNT;
    private int people;
    
    //Constructors
    public ReligiousEvent() {}

    public ReligiousEvent(int id, String title, String desc, Date date, double rentAmount) {
        super(id, title, desc, date, rentAmount);
        this.people = 0;
    }

    //Getters and setters
    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    //toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReligiousEvent {");
        sb.append(super.toString());
        sb.append(", \t\nFixed amount for grass wear: ").append(this.FIXEDAMOUNT).append("$");
        sb.append(", \t\nTotal Amount: ").append(this.TOTAL_AMOUNT).append("$");
        sb.append(", \t\nMaximum capacity: ").append(this.AMAX).append(" people");
        sb.append(", \t\nSouls for Jesus Christ: ").append(value(this.people));
        sb.append("\n}");
        return sb.toString();
    }
    
    //Method that returns a number if the pTransform variable is greater than 0,
    //else returns "No information :("
    String value(int people) {
        String info = (people > 0)? String.valueOf(people):"No information :(";
        return info;
    }
}
