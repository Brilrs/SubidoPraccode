package org.example.brillitecayllahua.brilliterose;

import org.example.brillitecayllahua.entities.Movie;
import org.example.brillitecayllahua.entities.Season;

import java.util.List;

public interface IMovieService {

    public List<Movie> list();
    public void insert(Movie m);


}
