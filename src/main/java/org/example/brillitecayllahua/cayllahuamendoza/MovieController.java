package org.example.brillitecayllahua.cayllahuamendoza;


import org.example.brillitecayllahua.brilliterose.IMovieService;
import org.example.brillitecayllahua.dtos.MovieDTO;
import org.example.brillitecayllahua.entities.Movie;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/peliculas")
public class MovieController {

    @Autowired
    private IMovieService mS;

    @GetMapping
    public List<MovieDTO> listar() {
        return mS.list().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x,MovieDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody MovieDTO dto) {
        ModelMapper n = new ModelMapper();
        Movie m= n.map(dto, Movie.class);
        mS.insert(m);
    }


}
