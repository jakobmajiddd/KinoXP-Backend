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

    public Seat() {

    }

    public Seat(Long seatId, Show show) {
        this.seatId = seatId;
        this.show = show;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
