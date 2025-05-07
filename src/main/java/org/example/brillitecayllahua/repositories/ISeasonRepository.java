package org.example.brillitecayllahua.repositories;

import org.example.brillitecayllahua.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISeasonRepository extends JpaRepository<Season, Integer> {


}
