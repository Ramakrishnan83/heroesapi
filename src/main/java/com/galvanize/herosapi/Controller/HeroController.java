package com.galvanize.herosapi.Controller;

import com.galvanize.herosapi.model.HeroEntity;
import com.galvanize.herosapi.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("heroes")
public class HeroController {

    HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public List<HeroEntity> getAllHeroes() {
        return heroService.fetchAllHeroes();
    }

    @GetMapping("/{heroName}")
    public HeroEntity getHeroDetail(@PathVariable String heroName) {
        return heroService.fetchHeroByName(heroName);
    }
}
