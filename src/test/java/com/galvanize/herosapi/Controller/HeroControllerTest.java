package com.galvanize.herosapi.Controller;

import com.galvanize.herosapi.model.HeroEntity;
import com.galvanize.herosapi.service.HeroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HeroControllerTest {
    List<HeroEntity> heroEntityList;
    HeroEntity heroEntity;

    @Mock
    HeroService heroService;

    @BeforeEach
    void setUp() {
        heroEntityList = new ArrayList<>();
        heroEntity = HeroEntity.builder()
                .id(1L)
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
        heroEntityList.add(heroEntity);

        heroEntity = HeroEntity.builder()
                .id(23L)
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
        heroEntityList.add(heroEntity);
    }

    @Test
    void getAllHeroes() {
        when(heroService.fetchAllHeroes()).thenReturn(heroEntityList);
        HeroController heroController = new HeroController(heroService);
        List<HeroEntity> listFromController = heroController.getAllHeroes();
        assertEquals(listFromController, heroEntityList);
    }
}