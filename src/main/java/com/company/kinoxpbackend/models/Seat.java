package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @Column(name = "seat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @JoinColumn(name = "reserved_seat_id")
    @OneToOne(cascade = CascadeType.ALL)
    private ReservedSeat reservedSeat;

    public Seat() {
    }

    public Seat(Long seatId, Room room, Customer customer, ReservedSeat reservedSeat) {
        this.seatId = seatId;
        this.room = room;
        this.customer = customer;
        this.reservedSeat = reservedSeat;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ReservedSeat getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(ReservedSeat reservedSeat) {
        this.reservedSeat = reservedSeat;
    }
}
