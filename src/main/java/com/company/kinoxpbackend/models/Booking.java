package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
