package org.example.brillitecayllahua.servicesimplements;

import org.example.brillitecayllahua.brilliterose.ISeasonService;
import org.example.brillitecayllahua.dtos.MovieDTO;
import org.example.brillitecayllahua.entities.Movie;
import org.example.brillitecayllahua.entities.Season;
import org.example.brillitecayllahua.repositories.ISeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasonServiceImplement implements ISeasonService {

    @Autowired
    private ISeasonRepository sR;

    @Override
    public List<Season> list() {
        return sR.findAll();
    }

    @Override
    public void insert (Season s) {  sR.save(s); }

    /*
    @Override
    public List<MovieDTO> findMoviesBySeasonReleaseDate (LocalDate fecha){
        List<Movie> movies = mR.findMoviesBySeasonReleaseDate(fecha);
        return movies.stream()
                .map(movie -> modelMapper.map(movie, MovieDTO.class))
                .collect(Collectors.toList());
    }*/

}
