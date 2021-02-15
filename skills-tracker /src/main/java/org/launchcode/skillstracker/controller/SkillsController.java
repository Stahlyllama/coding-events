package org.launchcode.skillstracker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String tracker() {
        String html =
                "<html>" +
                        "<body>" +
                           "<h1> Skills Tracker </h1>" +
                            "<h2> We have a few skills we would like to learn.  Here is the list </h2>" +
                            "<ol>" +
                                "<li>JavaScript</li>" +
                                "<li>Java</li>" +
                                "<li>Python</li>" +
                            "</ol>" +
                        "</body>" +
                "</html>";
        return html;
    }

    @PostMapping("selection")
    public String selectFav(@RequestParam String name, @RequestParam String favLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
       return
              "<html>" +
              "<body>" +
                    "<h1>" + name + "</h1>" +
                    "<ol>" +
                        "<li>" + favLanguage + "</li>" +
                        "<li>" + secondLanguage + "</li>" +
                        "<li>" + thirdLanguage + "</li>" +
                    "</ol>" +
              "</body>" +
              "</html>";
}


    @GetMapping("form")
    public String skillsForm(){
       return
                "<html>" +
                   "<body>" +
                     "<form method = '/selection' method = 'post'/>" +
                        "<label><br>Name:</Label><input type= 'text' name = 'name'/></br>" +
                            "<label><br>My favorite language:</Label><select name = 'favLanguage'/></br>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                        "</select>"+
                            "<label><br>My second favorite language:</Label><select name = 'secondLanguage'/></br>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                        "</select>"+
                            "<label><br>My third favorite language:</Label><select name = 'thirdLanguage'/></br>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                        "</select>"+
                        "<button>Submit</button>" +
                   "</body>" +
                "</html>";
           }
}
