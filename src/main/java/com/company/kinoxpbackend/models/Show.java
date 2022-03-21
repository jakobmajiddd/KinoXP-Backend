package com.company.kinoxpbackend.models;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shows")
public class Show {

    @Id
    @Column(name = "show_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long showId;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "start_date")
    private LocalTime startDate;

    @OneToMany
    @JoinColumn(name = "booking_id")
    private List<Booking> bookings;

    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;


    public Show() {

    }

    public Show(Long showId, Room room, LocalTime startDate, List<Booking> bookings, Movie movie) {
        this.showId = showId;
        this.room = room;
        this.startDate = startDate;
        this.bookings = bookings;
        this.movie = movie;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}