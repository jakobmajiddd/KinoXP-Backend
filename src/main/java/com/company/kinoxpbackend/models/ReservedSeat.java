package com.company.kinoxpbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



import javax.persistence.*;

@Entity
@Table(name = "reserved_seats")
public class ReservedSeat {

    @Id
    @Column(name = "reserved_seat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    //@ManyToOne(mappedBy = "brand", orphanRemoval = true, fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference("bookingtest")
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @JoinColumn(name = "seat_id")
    @OneToOne(cascade = CascadeType.MERGE)
    @JsonBackReference(value="seat2")
    private Seat seat;

    public ReservedSeat() {

    }

    public ReservedSeat(Long id, Booking booking, Seat seat) {
        this.id = id;
        this.booking = booking;
        this.seat = seat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long reservedSeatId) {
        this.id = reservedSeatId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
