package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;
import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model){
        List events = new List();
        events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple WWDC");
        events.add("SpringOne Platform");
        model.addAttribute("events", events);
        return "events/index";
    }
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

}
