package org.example.brillitecayllahua.repositories;
import org.example.brillitecayllahua.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {

    @Query(value = "select m.genre, count(*) from movie m GROUP BY m.genre", nativeQuery = true)
    List<String[]> countMoviesByGenre();

    @Query(value = "select DISTINCT m.* from movie m " +
            "JOIN season s ON m.id_movie = s.id_movie " +
            "WHERE s.release_date = :date", nativeQuery = true)
    List<Movie> findMoviesBySeasonReleaseDate(@Param("date") LocalDate date);


}
