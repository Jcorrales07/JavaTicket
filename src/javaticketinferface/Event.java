package javaticketinferface;

import java.util.ArrayList;
import java.util.Calendar;

/** @author Joe Corrales */
public class Event {
    //Class attributes
    protected static ArrayList<Event> events = new ArrayList<>();
    protected int id;
    protected String title;
    protected String desc;
    protected int year;
    protected int month;
    protected int day;
    protected Calendar date = Calendar.getInstance();
    protected double rentAmount;
    protected boolean active;
    protected boolean cancel;
    protected double charge;

    //Constructors
    public Event() {}

    public Event(int id, String title, String desc, int year, int month, int day, double rentAmount) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.date.set(year, month, day);
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Calendar getDate() {
        return this.date;
    }

    public void setDate(Calendar date) {
        this.date = date;
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
        sb.append(", \t\nDate: ").append(this.date.getTime());
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
