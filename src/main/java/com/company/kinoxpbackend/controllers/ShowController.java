package com.company.kinoxpbackend.controllers;

import com.company.kinoxpbackend.models.Show;
import com.company.kinoxpbackend.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        showService.createShow(show);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
