package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@Controller
public class HelloController {
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }
//    @GetMapping("goodbye")
//    @ResponseBody
//    public String goodbye() {
//        return "goodbye, Spring!";
//    }
//Responds to /hello?name=LaunchCode
    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model){
        String greeting = "Hello, " + name +"!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }
    //Responds to hello/LaunchCode
    @GetMapping ("hello/{name}")
       public String helloAgain(@PathVariable String name, Model model){
        String greeting = "Hello, " + name + "!";//could be done in one line instead of creating greeting variable on this line and using as second param on next line
        model.addAttribute("greeting", greeting);  //model.addAttribute("greeting", "Hello, " + name + "!");
            return "hello, ";
    }

    @GetMapping("form")
       public String helloForm(){
    return "form";
    }

    @GetMapping ("hello-names")
    public String helloNames(Model model){
        List names = new List();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);  //the first argument name is2
        return "hello-list";//the second names is the value that variable should have
    }


}
