package com.galvanize.herosapi.service;

import com.galvanize.herosapi.Repository.HeroRepository;
import com.galvanize.herosapi.model.HeroEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HeroServiceTest {
    @Mock
    HeroRepository heroRepository;
    @Test
    public void testFetchAllheros() {
        HeroService heroService = new HeroService(heroRepository);
        List<HeroEntity> heroEntities = heroService.fetchAllHeroes();
        assertEquals(heroEntities, new ArrayList<>());
    }
}