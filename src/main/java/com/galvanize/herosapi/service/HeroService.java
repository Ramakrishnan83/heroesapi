package com.galvanize.herosapi.service;

import com.galvanize.herosapi.model.HeroDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService {
    List<HeroDto> heroDtoList;
    HeroDto heroDto;

    public HeroService() {
        heroDtoList = new ArrayList<>();
        heroDto = HeroDto.builder()
                .id("1")
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
        heroDtoList.add(heroDto);

        heroDto = HeroDto.builder()
                .id("23")
                .heroName("wonder woman")
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
        heroDtoList.add(heroDto);
    }

    public List<HeroDto> fetchAllHeroes() {
        return this.heroDtoList;
    }

    public HeroDto fetchHeroById(String id) {
//        for (HeroDto heroDto : this.heroDtoList) {
//            if (heroDto.getId().equals(id)) {
//                return heroDto;
//            }
//        }
//        return null;
        return this.heroDtoList
                .stream()
                .filter(heroDto -> {
                    return heroDto.getId().equals(id);
                })
                .findFirst()
                .get();
    }
}
