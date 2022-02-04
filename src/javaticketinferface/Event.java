package javaticketinferface;

import java.util.Date;

/** @author Joe Corrales */
public class Event {
    protected static int id;
    protected String entTitle;
    protected String entDescription;
    protected Date date;
    protected double rentAmount;

    public Event() {}

    public Event(String entTitle, String entDescription, Date date, double rentAmount) {
        Event.id++;
        this.entTitle = entTitle;
        this.entDescription = entDescription;
        this.date = date;
        this.rentAmount = rentAmount;
    }
    
    public int getId() {
        return this.id;
    }

    public String getEntTitle() {
        return this.entTitle;
    }

    public void setEntTitle(String entTitle) {
        this.entTitle = entTitle;
    }

    public String getEntDescription() {
        return this.entDescription;
    }

    public void setEntDescription(String entDescription) {
        this.entDescription = entDescription;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getRentAmount() {
        return this.rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event{entTitle=").append(this.entTitle);
        sb.append(", entDescription=").append(this.entDescription);
        sb.append(", date=").append(this.date);
        sb.append(", rentAmount=").append(this.rentAmount);
        sb.append('}');
        return sb.toString();
    }
    
    
}
