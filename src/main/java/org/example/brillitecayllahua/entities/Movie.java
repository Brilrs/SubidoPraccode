package org.example.brillitecayllahua.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovie;

    @Column(name= "name",length = 20,nullable = false)
    private String name;

    @Column(name = "releaseDate", nullable = false)
    private LocalDate releaseDate;

    @Column(name = "releaseTime", nullable = false)
    private LocalTime releaseTime;

    @Column(name= "genre",length = 20,nullable = false)
    private String genre;

    @Column(name = "likesCount", length = 20,nullable = false)
    private int likesCount;

    public Movie() {
    }

    public Movie(int idMovie, String name, LocalDate releaseDate, LocalTime releaseTime, String genre, int likesCount) {
        this.idMovie = idMovie;
        this.name = name;
        this.releaseDate = releaseDate;
        this.releaseTime = releaseTime;
        this.genre = genre;
        this.likesCount = likesCount;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalTime getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(LocalTime releaseTime) {
        this.releaseTime = releaseTime;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
