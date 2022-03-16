package com.company.kinoxpbackend.models;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;

@Entity
@Table(name = "shows")
public class Show {

    @Id
    @Column(name = "show_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long showId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "genre")
    private String genre;

    @Column(name = "age_limit")
    private Integer ageLimit;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private Date finishDate;

    @Column(name = "duration")
    private String duration;

    public Show() {

    }

    public Show(Long showId, String movieName, String genre, Integer ageLimit, String imageUrl, Date startDate, Date finishDate, String duration) {
        this.showId = showId;
        this.movieName = movieName;
        this.genre = genre;
        this.ageLimit = ageLimit;
        this.imageUrl = imageUrl;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.duration = duration;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}