package org.example.brillitecayllahua.brilliterose;

import org.example.brillitecayllahua.entities.Season;

import java.util.List;

public interface ISeasonService {

    public List<Season> list();
    public void insert(Season s);
}
