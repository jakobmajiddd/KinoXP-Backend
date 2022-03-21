package com.company.kinoxpbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name = "customer_id")
    private Long customerId;

    @OneToMany
    @JoinColumn(name = "booking_id")
    private List<Booking> bookings;

    private String name;

    private String email;

    public Customer() {

    }

    public Customer(Long customerId, List<Booking> bookings, String name, String email) {
        this.customerId = customerId;
        this.bookings = bookings;
        this.name = name;
        this.email = email;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
