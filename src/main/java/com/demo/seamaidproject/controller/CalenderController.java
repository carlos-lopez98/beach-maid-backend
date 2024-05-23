package com.demo.seamaidproject.controller;

import com.demo.seamaidproject.models.CalendarEvent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calendar")
public class CalenderController {



    @PostMapping
    public String add(@RequestBody CalendarEvent event){


        return "Request has been scheduled";
    }




}
