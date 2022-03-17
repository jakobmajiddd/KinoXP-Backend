package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @Column(name = "seat_id")
    private Long seatId;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;
}
