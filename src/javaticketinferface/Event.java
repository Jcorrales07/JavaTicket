package javaticketinferface;

import java.util.ArrayList;
import java.util.Date;

/** @author Joe Corrales */
public abstract class Event {
    //Class attributes
    protected static ArrayList<Event> events = new ArrayList<>();
    protected int id;
    protected String title;
    protected String desc;
    protected Date date;
    protected String fdate;
    protected double rentAmount;
    protected boolean active;
    protected boolean cancel;
    protected double charge;

    //Constructors
    public Event() {}

    public Event(int id, String title, String desc, Date date, double rentAmount) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.date = date;
        this.rentAmount = rentAmount;
        this.active = true;
        this.cancel = false;
        this.charge = 0;
    }
    
    //Getters and setters
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.desc;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    public double getRentAmount() {
        return this.rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isCancel() {
        return cancel;
    }
    
    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
    
    //toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" \t\nEvent's ID: ").append(this.id);
        sb.append(", \t\nTitle: '").append(this.title).append("'");
        sb.append(", \t\nDescription: ").append(this.desc);
        sb.append(", \t\nDate: ").append(this.date.toString());
        sb.append(", \t\nAmount: ").append(this.rentAmount).append("$");
        sb.append(", \t\nActive: ").append(ifActive());
        return sb.toString();
    }
    
    public String ifActive() {
        String message = (active)?"Event Currently Active": "EVENT HAS BEEN CANCELED";
        return message;
    }
    
    public String showInfo() {
        String message = (cancel)? charge+"$" : "0$";
        return message;
    }
}
