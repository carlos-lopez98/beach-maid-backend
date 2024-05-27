package com.demo.seamaidproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name= "time_slots")
public class TimeSlot {

    @Id
    @Column(name = "date")
    private Date date;

    private static final int slotHours = 4;

    @Column(name ="owner")
    private String owner;
    @Column(name="hours_needed")
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

}
