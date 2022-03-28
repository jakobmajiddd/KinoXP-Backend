package com.company.kinoxpbackend.controllers;

import com.company.kinoxpbackend.exceptions.ShowNotFoundException;
import com.company.kinoxpbackend.models.Show;
import com.company.kinoxpbackend.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/shows") //Slet shows, kun api
public class ShowController {

    private final ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        Show showCreated = showService.createShow(show);
        return new ResponseEntity<>(showCreated, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping()
    public ResponseEntity<List<Show>> getShows() {
        List<Show> shows = showService.getShows();
        return new ResponseEntity<>(shows, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Show> getShow(@PathVariable Long id) throws ShowNotFoundException {
        Show show = showService.findByid(id);
        return new ResponseEntity<>(show, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Show> editShow(@PathVariable Long id, @RequestBody Show show) {
        show.setId(id);
        return new ResponseEntity<>(showService.editShow(show), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Show> deleteShow(@PathVariable Long id) {
        showService.deleteShow(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<List<Show>> getShowsByMovieId(@PathVariable Long id) {
        System.out.println(id);
        List<Show> shows = showService.getShowsByMovieId(id);
        System.out.println(shows.size());
        return new ResponseEntity<>(shows, HttpStatus.OK);
    }
}
