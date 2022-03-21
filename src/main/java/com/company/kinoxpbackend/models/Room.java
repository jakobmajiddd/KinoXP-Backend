package com.company.kinoxpbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "name")
    private String name;

    @Column(name = "seat_amount")
    private Integer seatAmount;
    @OneToMany
    @JoinColumn(name = "seat_id")
    private List<Seat> seats;

    public Room() {

    }

    public Room(Long roomId, String name, Integer seatAmount, List<Seat> seats) {
        this.roomId = roomId;
        this.name = name;
        this.seatAmount = seatAmount;
        this.seats = seats;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeatAmount() {
        return seatAmount;
    }

    public void setSeatAmount(Integer seatAmount) {
        this.seatAmount = seatAmount;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
