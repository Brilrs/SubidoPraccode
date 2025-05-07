package org.example.brillitecayllahua.dtos;
import java.time.LocalDate;
import java.time.LocalTime;

public class MovieDTO {

    private int idMovie;
    private String name;
    private LocalDate releaseDate;
    private LocalTime releaseTime;
    private String genre;
    private int likesCount;

    public LocalTime getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(LocalTime releaseTime) {
        this.releaseTime = releaseTime;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }
}
