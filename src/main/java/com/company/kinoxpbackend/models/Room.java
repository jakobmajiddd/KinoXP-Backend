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


}
