package org.lessons.java.thymeleaf.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.thymeleaf.best_of_the_year.model.Movie;
import org.lessons.java.thymeleaf.best_of_the_year.model.Song;
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

    private List<Movie> getBestMovies() {

        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("1", "Inception"));
        allMovies.add(new Movie("2", "Interstellar"));
        allMovies.add(new Movie("3", "The Matrix"));
        allMovies.add(new Movie("4", "The Prestige"));
        allMovies.add(new Movie("5", "Tenet"));
        allMovies.add(new Movie("6", "Memento"));
        allMovies.add(new Movie("7", "Dunkirk"));
        allMovies.add(new Movie("8", "Oppenheimer"));
        allMovies.add(new Movie("9", "The Dark Knight"));
        allMovies.add(new Movie("10", "Batman Begins"));

        return allMovies.subList(0, 5);
    }

    private List<Song> getBestSongs() {
        return;
    }

}
