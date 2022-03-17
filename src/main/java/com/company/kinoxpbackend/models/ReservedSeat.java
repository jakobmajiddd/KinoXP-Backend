package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "reserved_seats")
public class ReservedSeat {

    @Id
    @Column(name = "reserved_seat_id")
    private Long reservedSeatId;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;
}
