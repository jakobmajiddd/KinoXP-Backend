package com.company.kinoxpbackend.controllers;


import com.company.kinoxpbackend.models.Movie;
import com.company.kinoxpbackend.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    @CrossOrigin
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        System.out.println("virker");
        movieService.createMovie(movie);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<List<Movie>> getMovies() {
        List<Movie> movies = movieService.getMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);

    }

}
