package org.lessons.java.thymeleaf.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.thymeleaf.best_of_the_year.model.Movie;
import org.lessons.java.thymeleaf.best_of_the_year.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "Mattia");
        return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model) {

        List<String> moviesString = new ArrayList<>();

        for (Movie movie : getBestMovies()) {
            moviesString.add(movie.getTitle());
        }

        model.addAttribute("topMovies", String.join(", ", moviesString));

        return "movies";
    }

    @GetMapping("/movies/{movieID}")
    public String moviesID(@PathVariable String movieID, Model model) {
        model.addAttribute("movieID", movieID);
        return "singleMovie";
    }

    @GetMapping("/songs")
    public String songs(Model model) {

        List<String> songsString = new ArrayList<>();

        for (Song song : getBestSongs()) {
            songsString.add(song.getTitle());
        }

        model.addAttribute("topSongs", String.join(", ", songsString));

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

        return allMovies;
    }

    private List<Song> getBestSongs() {

        List<Song> allSongs = new ArrayList<>();
        allSongs.add(new Song("1", "Bohemian Rhapsody", "Queen"));
        allSongs.add(new Song("2", "Imagine", "John Lennon"));
        allSongs.add(new Song("3", "Billie Jean", "Michael Jackson"));
        allSongs.add(new Song("4", "Smells Like Teen Spirit", "Nirvana"));
        allSongs.add(new Song("5", "Hey Jude", "The Beatles"));
        allSongs.add(new Song("6", "Rolling in the Deep", "Adele"));
        allSongs.add(new Song("7", "Blinding Lights", "The Weeknd"));
        allSongs.add(new Song("8", "Shape of You", "Ed Sheeran"));
        allSongs.add(new Song("9", "Lose Yourself", "Eminem"));
        allSongs.add(new Song("10", "Shallow", "Lady Gaga & Bradley Cooper"));

        return allSongs;
    }
}
