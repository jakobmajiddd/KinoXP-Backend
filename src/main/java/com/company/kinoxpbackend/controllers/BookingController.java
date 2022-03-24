package com.company.kinoxpbackend.controllers;

import com.company.kinoxpbackend.models.Booking;
import com.company.kinoxpbackend.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    @CrossOrigin
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
        System.out.println("Hejsa");
        bookingService.createBooking(booking);
        System.out.println("Hej");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<List<Booking>> getBookings() {
        List <Booking> bookings = bookingService.getBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
}
