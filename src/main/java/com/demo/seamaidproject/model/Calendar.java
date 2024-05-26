package com.demo.seamaidproject.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "calendar")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int calendarId;

    @Column(name = "AMSlot")
    private TimeSlot AMSlot;
    @Column(name = "PMSlot")
    private TimeSlot PMSlot;

    public int getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(int calendarId) {
        this.calendarId = calendarId;
    }

    public TimeSlot getAM() {
        return AMSlot;
    }

    public void setAM(TimeSlot AM) {
        this.AMSlot = AM;
    }

    public TimeSlot getPM() {
        return PMSlot;
    }

    public void setPM(TimeSlot PM) {
        this.PMSlot = PM;
    }
}
