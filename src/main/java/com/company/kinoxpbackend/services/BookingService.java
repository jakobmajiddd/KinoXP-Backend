package com.company.kinoxpbackend.services;

import com.company.kinoxpbackend.models.Booking;
import com.company.kinoxpbackend.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void createBooking(Booking booking) {
        bookingRepository.save(booking);
    }
}
