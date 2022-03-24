package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "reserved_seats")
public class ReservedSeat {

    @Id
    @Column(name = "reserved_seat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservedSeatId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @JoinColumn(name = "seat_id")
    @OneToOne(cascade = CascadeType.MERGE)
    private Seat seat;


    public ReservedSeat() {

    }

    public ReservedSeat(Long reservedSeatId, Booking booking, Seat seat) {
        this.reservedSeatId = reservedSeatId;
        this.booking = booking;
        this.seat = seat;
    }

    public Long getReservedSeatId() {
        return reservedSeatId;
    }

    public void setReservedSeatId(Long reservedSeatId) {
        this.reservedSeatId = reservedSeatId;
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
