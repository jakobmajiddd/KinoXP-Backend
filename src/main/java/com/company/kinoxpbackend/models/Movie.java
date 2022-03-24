package com.company.kinoxpbackend.models;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Table(name = "movies")
@Entity
public class Movie {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.MERGE)
    @JsonBackReference(value="shows")
    @JoinColumn(name = "movie_id")
    private List<Show> shows;

    @Column(name = "image_url")
    private String imageUrl;

    private String name;

    private Integer duration;

    @Column(name = "age_limit")
    private Integer ageLimit;

    private String genre;


    private Double price;

    public Movie() {

    }

    public Movie(Long id, List<Show> shows, String imageUrl, String name, Integer duration, Integer ageLimit, String genre, Double price) {
        this.id = id;
        this.shows = shows;
        this.imageUrl = imageUrl;
        this.name = name;
        this.duration = duration;
        this.ageLimit = ageLimit;
        this.genre = genre;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}