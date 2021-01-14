package com.galvanize.herosapi.service;

import com.galvanize.herosapi.Repository.HeroRepository;
import com.galvanize.herosapi.model.HeroEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService {
    List<HeroEntity> heroEntityList;
    HeroEntity heroEntity;

    HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
        seedData();
    }


    public List<HeroEntity> fetchAllHeroes() {
        return this.heroEntityList;
    }

    public HeroEntity fetchHeroByName(String heroName) {
        return this.heroEntityList
                .stream()
                .filter(heroDto -> {
                    return heroDto.getHeroName().equals(heroName);
                })
                .findFirst()
                .get();
    }
    private void seedData(){
        heroEntity = HeroEntity.builder()
                .heroName("wonderMan")
                .image("123")
                .height("51 cm")
                .specialPower("super speed")
                .intelligence("super smart")
                .strength("super strong")
                .description("super cool")
                .story("just a cool guy")
                .agility("very agile")
                .power("super powerful")
                .speed("really speedy")
                .build();
        this.heroRepository.save(heroEntity);

        heroEntity = HeroEntity.builder()
                .heroName("wonderWoman")
                .image("123")
                .height("51 cm")
                .specialPower("super speed")
                .intelligence("super smart")
                .strength("super strong")
                .description("super cool")
                .story("just a cool guy")
                .agility("very agile")
                .power("super powerful")
                .speed("really speedy")
                .build();
        this.heroRepository.save(heroEntity);

    }
}
