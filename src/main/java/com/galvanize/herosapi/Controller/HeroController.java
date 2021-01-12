package com.galvanize.herosapi.Controller;

import com.galvanize.herosapi.model.HeroDto;
import com.galvanize.herosapi.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<HeroDto> fetchAll() {
        return heroService.fetchAllHeroes();
    }

}
