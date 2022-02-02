package javaticketinferface;

import java.util.Date;

/** @author Joe Corrales */
public class Event {
    protected static int code;
    protected String entTitle;
    protected String entDescription;
    protected Date date;
    protected double rentAmount;

    public Event() {}

    public Event(String entTitle, String entDescription, Date date, double rentAmount) {
        this.entTitle = entTitle;
        this.entDescription = entDescription;
        this.date = date;
        this.rentAmount = rentAmount;
    }
    
    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Event.code = code;
    }

    public String getEntTitle() {
        return entTitle;
    }

    public void setEntTitle(String entTitle) {
        this.entTitle = entTitle;
    }

    public String getEntDescription() {
        return entDescription;
    }

    public void setEntDescription(String entDescription) {
        this.entDescription = entDescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }
}
