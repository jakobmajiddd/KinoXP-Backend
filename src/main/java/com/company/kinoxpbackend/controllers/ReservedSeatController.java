package com.company.kinoxpbackend.controllers;

import com.company.kinoxpbackend.models.ReservedSeat;
import com.company.kinoxpbackend.services.ReservedSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;

@RestController
@CrossOrigin
@RequestMapping("/api/reserved-seat")
public class ReservedSeatController {

    private final ReservedSeatService reservedSeatService;

    @Autowired
    public ReservedSeatController(ReservedSeatService reservedSeatService) {
        this.reservedSeatService = reservedSeatService;
    }

    @PostMapping()
    public ResponseEntity<ReservedSeat> reserveSeats(@RequestBody ReservedSeat reservedSeat) {
        ReservedSeat savedReservedSeat = reservedSeatService.reserve(reservedSeat);
        return new ResponseEntity<>(savedReservedSeat, HttpStatus.OK);
    }
}
