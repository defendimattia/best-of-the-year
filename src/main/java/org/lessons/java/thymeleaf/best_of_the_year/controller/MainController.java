package org.lessons.java.thymeleaf.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "Mattia");
        return "home";
    }

    @GetMapping("/movies")
    public String movies() {

        return "movies";
    }

    @GetMapping("/songs")
    public String songs() {

        return "songs";
    }

}
