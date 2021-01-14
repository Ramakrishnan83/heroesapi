package com.galvanize.herosapi.service;

import com.galvanize.herosapi.Repository.HeroRepository;
import com.galvanize.herosapi.model.HeroEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HeroServiceTest {


    @Mock
    HeroRepository heroRepository;

    HeroEntity wonderWoman;
    HeroEntity wonderMan;
    List<HeroEntity> heroListExpected;

    @InjectMocks
    HeroService heroService;

    @BeforeEach
    public void setUp() {
        wonderWoman = HeroEntity.builder()
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

        wonderMan = HeroEntity.builder()
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

        heroListExpected = new ArrayList<>();
        heroListExpected.add(wonderMan);
        heroListExpected.add(wonderWoman);
    }


    @Test
    @DisplayName("Verify that seed data is called")
    public void verifySeedDataCallsDatabase() {
        Mockito.verify(heroRepository).save(wonderWoman);
        Mockito.verify(heroRepository).save(wonderWoman);
    }

    @Test
    @DisplayName("Ensure that repository is called with find all")
    public void testFetchAllheros() {
        when(heroRepository.findAll()).thenReturn(heroListExpected);
        List<HeroEntity> heroEntities = heroService.fetchAllHeroes();
        assertEquals(heroEntities, heroListExpected);
        assertEquals(heroEntities.size(), heroListExpected.size());
    }

    @Test
    @DisplayName("Fetch hero by name calls repository find by name")
    public void fetchHeroByName() {
        when(heroRepository.findByHeroName("wonderWoman")).thenReturn(wonderWoman);
        HeroEntity heroEntity = heroService.fetchHeroByName("wonderWoman");
        assertEquals(heroEntity.getHeroName(), wonderWoman.getHeroName());
    }
}