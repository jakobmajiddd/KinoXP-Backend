package com.company.kinoxpbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "shows")
public class Show {

    @Id
    @Column(name = "show_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long showId;

    @Column(name = "movie_name")
    private String movieName;

    public Show() {

    }

    public Show(Long showId, String movieName) {
        this.showId = showId;
        this.movieName = movieName;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
