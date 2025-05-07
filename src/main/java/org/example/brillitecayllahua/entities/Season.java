package org.example.brillitecayllahua.entities;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Season")
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSeason;

    @Column(name = "title",length = 25,nullable = false)
    private String title;

    @Column(name = "releaseDate",nullable = false)
    private LocalDate releaseDate;

    @Column(name = "episodeCount", length = 20,nullable = false)
    private int episodeCount;

    @Column(name = "synopsis",length = 30,nullable = false)
    private String synopsis;

    @ManyToOne
    @JoinColumn(name = "idMovie")
    private Movie movie;

    public Season() {
    }

    public Season(String synopsis, int idSeason, String title, LocalDate releaseDate, int episodeCount, Movie movie) {
        this.synopsis = synopsis;
        this.idSeason = idSeason;
        this.title = title;
        this.releaseDate = releaseDate;
        this.episodeCount = episodeCount;
        this.movie = movie;
    }

    public int getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(int idSeason) {
        this.idSeason = idSeason;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
