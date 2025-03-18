package org.lessons.java.spring.hello_spring_mvc.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/greeting")
    public String getGreetingPage(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/user")
    public String getMethodName(@RequestParam(name = "name") String name,
            @RequestParam(name = "surname") String surname, Model model) {

        Random random = new Random();
        int num = random.nextInt(999);
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        model.addAttribute("num", num);
        return "user";
    }

}
