package com.demo.seamaidproject.controller;

import com.demo.seamaidproject.model.CalendarEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calendar")
public class CalenderController {

    @Autowired
    CalendarService service;


    @PostMapping
    public String add(@RequestBody CalendarEvent event){


        return "Request has been scheduled";
    }

    @GetMapping
    public CalendarEvent getEvent(){




        return calendarEvent;
    }



}
