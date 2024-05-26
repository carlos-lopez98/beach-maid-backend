package com.demo.seamaidproject.model;

public class Calendar {

    private int calendarId;
    private TimeSlot AM;
    private TimeSlot PM;

    public int getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(int calendarId) {
        this.calendarId = calendarId;
    }

    public TimeSlot getAM() {
        return AM;
    }

    public void setAM(TimeSlot AM) {
        this.AM = AM;
    }

    public TimeSlot getPM() {
        return PM;
    }

    public void setPM(TimeSlot PM) {
        this.PM = PM;
    }
}
