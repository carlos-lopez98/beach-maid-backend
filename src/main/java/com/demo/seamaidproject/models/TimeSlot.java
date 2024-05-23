package com.demo.seamaidproject.models;

public class TimeSlot {

    private final int slotHours = 4;
    private String owner;
    private String hoursNeeded;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHoursNeeded() {
        return hoursNeeded;
    }

    public void setHoursNeeded(String hoursNeeded) {
        this.hoursNeeded = hoursNeeded;
    }

    public int getSlotHours (){
        return this.slotHours;
    }
}
