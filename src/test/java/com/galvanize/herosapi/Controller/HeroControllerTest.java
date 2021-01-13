package com.galvanize.herosapi.Controller;

import com.galvanize.herosapi.model.HeroDto;
import com.galvanize.herosapi.service.HeroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class HeroControllerTest {
    List<HeroDto> heroDtoList;
    HeroDto heroDto;

    @Mock
    HeroService heroService;

    @BeforeEach
    void setUp() {
        heroDtoList = new ArrayList<>();
        heroDto = HeroDto.builder()
                .id("1")
                .heroName("Spider Man")
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
                .heroName("Batman")
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



    @Test
    void getAllHeroes() {
        when(heroService.fetchAllHeroes()).thenReturn(heroDtoList);

        HeroController heroController = new HeroController(heroService);
        List<HeroDto> listFromController = heroController.getAllHeroes();
        assertEquals(listFromController, heroDtoList);
    }
}