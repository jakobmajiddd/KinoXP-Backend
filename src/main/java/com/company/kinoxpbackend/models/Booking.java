package com.company.kinoxpbackend.models;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {


    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne//(cascade = {CascadeType.ALL})
    @JoinColumn(name = "show_id")
    private Show show;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private Customer customer;

    @OneToMany(cascade = CascadeType.MERGE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "reserved_seat_id")
    private List<ReservedSeat> reservedSeats;

    public Booking() {

    }

    public Booking(Long id, Show show, Customer customer, List<ReservedSeat> reservedSeats) {
        this.id = id;
        this.show = show;
        this.customer = customer;
        this.reservedSeats = reservedSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ReservedSeat> getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(List<ReservedSeat> reservedSeats) {
        this.reservedSeats = reservedSeats;
    }
}
