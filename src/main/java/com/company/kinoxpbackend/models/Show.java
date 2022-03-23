package com.company.kinoxpbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "shows")
public class Show {

    @Id
    @Column(name = "show_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "start_date")
    private LocalTime startDate;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "show_id")
    private List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;


    public Show() {


    }


    public Show(Long id, Room room, LocalTime startDate, List<Booking> bookings, Movie movie) {
        this.id = id;
        this.room = room;
        this.startDate = startDate;
        this.bookings = bookings;
        this.movie = movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long showId) {
        this.id = showId;
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