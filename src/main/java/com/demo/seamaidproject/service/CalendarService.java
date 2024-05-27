package com.demo.seamaidproject.service;

import com.demo.seamaidproject.model.CalendarEvent;
import com.demo.seamaidproject.repository.CalendarRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

public class CalendarService {

    @Autowired
    private CalendarRepo repo;


    public CalendarEvent getEvent(){


    }



    public boolean checkAvailability(Date date){

        return false;
    }
}
