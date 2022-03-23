package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {


    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Booking() {

    }

    public Booking(Long bookingId, Show show, Customer customer) {
        this.bookingId = bookingId;
        this.show = show;
        this.customer = customer;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
