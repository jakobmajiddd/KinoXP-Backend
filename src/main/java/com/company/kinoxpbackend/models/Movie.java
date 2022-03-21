package com.company.kinoxpbackend.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "movies")
@Entity
public class Movie {

    @Id
    @Column(name = "movie_id")
    private Long movieId;

    private String title;

    private Integer duration;

    @Column(name = "age_limit")
    private Integer ageLimit;

    private String genre;

    public Movie() {

    }

    public Movie(Long movieId, String title, Integer duration, Integer ageLimit, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.duration = duration;
        this.ageLimit = ageLimit;
        this.genre = genre;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}