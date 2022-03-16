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
@RequestMapping("/api/shows")
public class ShowController {

    private final ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        Show showCreated = showService.createShow(show);
        System.out.println(showCreated);
        return new ResponseEntity<>(showCreated, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping()
    public ResponseEntity<List<Show>> getShows() {
        List<Show> shows = showService.getShows();
        return new ResponseEntity<>(shows, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/show/{id}")
    public ResponseEntity<Show> getShow(@PathVariable Long id) throws ShowNotFoundException {
        Show show = showService.findByid(id);
        return new ResponseEntity<>(show, HttpStatus.OK);
    }
}
