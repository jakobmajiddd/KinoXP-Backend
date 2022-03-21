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

    @OneToOne // Test om man kan booke den samme sædenr. i forskellige rum
    @JoinColumn(name = "seat_id")
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
