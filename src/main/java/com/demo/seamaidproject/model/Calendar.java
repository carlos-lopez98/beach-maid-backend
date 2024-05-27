package com.demo.seamaidproject.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Entity
@Data
@Table(name = "calendar")
public class Calendar {

    @Id
    @Column(name= "date")
    private Date date;

    @Column(name = "AMSlot")
    private TimeSlot AMSlot;
    @Column(name = "PMSlot")
    private TimeSlot PMSlot;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {this.date = date}

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
