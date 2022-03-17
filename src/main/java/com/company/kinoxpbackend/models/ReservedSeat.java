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

    public ReservedSeat() {

    }

    public ReservedSeat(Long reservedSeatId, Booking booking, Show show) {
        this.reservedSeatId = reservedSeatId;
        this.booking = booking;
        this.show = show;
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

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
