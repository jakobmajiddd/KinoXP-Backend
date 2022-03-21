package com.company.kinoxpbackend.models;


import javax.persistence.*;


@Table(name = "movies")
@Entity
public class Movie {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;

    private String name;

    private Integer duration;

    @Column(name = "age_limit")
    private Integer ageLimit;

    private String genre;

    public Movie() {

    }



    public Movie(Long id, String imageUrl, String name, Integer duration, Integer ageLimit, String genre) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.duration = duration;
        this.ageLimit = ageLimit;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}