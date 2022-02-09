package javaticketinferface;

import java.util.Calendar;

/** @author Joe Corrales */
public class ReligiousEvent extends Event {
    private final int AMAX = 30000;

    public ReligiousEvent() {}

    public ReligiousEvent(String entTitle, String entDescription, Calendar date, double rentAmount) {
        super(entTitle, entDescription, date, rentAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" ReligiousEvent { Amount MAX =").append(AMAX);
        sb.append('}');
        return sb.toString();
    }
}
