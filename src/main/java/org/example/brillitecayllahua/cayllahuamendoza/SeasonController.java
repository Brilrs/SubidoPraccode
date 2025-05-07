package org.example.brillitecayllahua.cayllahuamendoza;


import org.example.brillitecayllahua.brilliterose.IMovieService;
import org.example.brillitecayllahua.brilliterose.ISeasonService;
import org.example.brillitecayllahua.dtos.MovieDTO;
import org.example.brillitecayllahua.dtos.SeasonDTO;
import org.example.brillitecayllahua.entities.Season;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temporadas")
public class SeasonController {

    @Autowired
    private ISeasonService mS;

    @GetMapping("/lista")
    public List<SeasonDTO> listar() {
        return mS.list().stream().map( w->{
            ModelMapper m = new ModelMapper();
            return m.map(w, SeasonDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/prueba")
    public void insertar(@RequestBody SeasonDTO dto) {
        ModelMapper m = new ModelMapper();
        Season s = m.map(dto, Season.class);
        mS.insert(s);
    }
}
