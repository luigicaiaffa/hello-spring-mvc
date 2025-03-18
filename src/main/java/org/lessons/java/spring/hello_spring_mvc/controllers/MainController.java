package org.lessons.java.spring.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }
    


}
