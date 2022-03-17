package com.company.kinoxpbackend.services;

import com.company.kinoxpbackend.models.ReservedSeat;
import com.company.kinoxpbackend.repositories.ReservedSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservedSeatService {

    private final ReservedSeatRepository reservedSeatRepository;

    @Autowired
    public ReservedSeatService(ReservedSeatRepository reservedSeatRepository) {
        this.reservedSeatRepository = reservedSeatRepository;
    }

    public ReservedSeat reserve(ReservedSeat reservedSeat) {
        return reservedSeatRepository.save(reservedSeat);
    }
}
