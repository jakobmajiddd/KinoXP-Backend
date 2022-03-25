package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @Column(name = "seat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToOne(mappedBy = "seat")
    private Customer customer;


    @OneToOne(mappedBy = "seat", cascade = CascadeType.MERGE)
    private ReservedSeat reservedSeat;

    public Seat() {
    }

    public Seat(Long id, Room room, Customer customer, ReservedSeat reservedSeat) {
        this.id = id;
        this.room = room;
        this.customer = customer;
        this.reservedSeat = reservedSeat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long seatId) {
        this.id = seatId;
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
