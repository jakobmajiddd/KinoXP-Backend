package com.company.kinoxpbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Show {

    @Id
    @Column(name = "show_id")
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
