package com.company.kinoxpbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Room() {

    }

    public Room(Long roomId, String name, Integer seatAmount) {
        this.roomId = roomId;
        this.name = name;
        this.seatAmount = seatAmount;
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
}
