package com.demo.seamaidproject.controller;

import com.demo.seamaidproject.model.CalendarEvent;
import com.demo.seamaidproject.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calendar")
public class CalenderController {

    @Autowired
    CalendarService service;


    @PostMapping
    public ResponseEntity addBooking(@RequestBody CalendarEvent event){

        if(service.checkAvailability(event.getDate()) == false){
            return ResponseEntity.ok().body("No booking available for the selected date");
        }


        return "Request has been scheduled";
    }

    @GetMapping
    public CalendarEvent getEvent(){




        return calendarEvent;
    }



}
