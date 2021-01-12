package com.galvanize.herosapi.service;

import com.galvanize.herosapi.model.HeroDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService {
    public List<HeroDto> fetchAllHeroes() {
        List<HeroDto> heroDtoList = new ArrayList<>();
        heroDtoList.add(new HeroDto("1", "wonderMan"));
        return heroDtoList;
    }
}
