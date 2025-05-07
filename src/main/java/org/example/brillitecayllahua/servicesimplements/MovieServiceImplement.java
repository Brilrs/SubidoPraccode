package org.example.brillitecayllahua.servicesimplements;


import org.example.brillitecayllahua.brilliterose.IMovieService;
import org.example.brillitecayllahua.entities.Movie;
import org.example.brillitecayllahua.repositories.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImplement implements IMovieService {

    @Autowired
    private IMovieRepository mR;

    @Override
    public List<Movie> list() { return mR.findAll(); }

    @Override
    public void insert (Movie m) { mR.save(m); }

    /*
    @Override
    public List<String[]> countMoviesByGenre()
    { return mR.countMoviesByGenre(); }*/

}
