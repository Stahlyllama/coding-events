package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    private static ArrayList<String> events = new ArrayList<>(); //as long as your declaration includes the data type of the elements that will be stored
    //you don't need to put that type in the constructor call ArrayList<> that'll be implicitly inferred

    @GetMapping
    public String displayAllEvents(Model model) {
//       ArrayList<String> events = new ArrayList<>();
 //       events.add("Code with Pride"); this is hardcoded four events
//       events.add("Strange Loop");
//       events.add("Apple WWDC");
//       events.add("SpringOne Platform");
//       model.addAttribute("title", "All Events");
//       model.addAttribute("events", events);

        HashMap<String, String> events= new HashMap<>();
        events.put("Hour of Code", "Getting young minds interested in coding.");
        events.put("Strange Loop", "coding conference of professionals sharing ideas.");
        events.put("CES", "Annual trade show showing awesome new tech.");
        model.addAttribute("events", events);
        return "events/index";
    }
    //lives at /events/create
//    @GetMapping("create")
//    public String renderCreateEventForm(){
//        return "events/create";
//    }
//    @PostMapping
//    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:"; //put name of path, which since this is the root path it takes the displayAllEvents method.

//    }
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";
    }

}
