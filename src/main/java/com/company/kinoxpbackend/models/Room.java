package com.company.kinoxpbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @Column(name = "room_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "seat_amount")
    private Integer seatAmount;


    public Room() {

    }

    public Room(Long id, String name, Integer seatAmount) {
        this.id = id;
        this.name = name;
        this.seatAmount = seatAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
