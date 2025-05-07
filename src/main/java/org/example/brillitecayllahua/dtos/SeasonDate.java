package org.example.brillitecayllahua.dtos;

import java.time.LocalDate;

public class SeasonDate {

    private String name;
    private LocalDate releaseDate;

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
}
