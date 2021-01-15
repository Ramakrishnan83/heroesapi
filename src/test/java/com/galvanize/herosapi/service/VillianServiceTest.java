package com.galvanize.herosapi.service;

import com.galvanize.herosapi.Repository.HeroRepository;
import com.galvanize.herosapi.Repository.VillianRepository;
import com.galvanize.herosapi.model.HeroEntity;
import com.galvanize.herosapi.model.VillianEntity;
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

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VillianServiceTest {

    @Mock
    VillianRepository villianRepository;

    VillianEntity catWoman;
    VillianEntity catMan;

    List<VillianEntity> villainListExpected;

    @InjectMocks
    VillianService villianService;

    @BeforeEach
    public void setUp() {
        catWoman = VillianEntity.builder()
                .id(10L)
                .villianName("catWoman")
                .build();

        catMan =VillianEntity.builder()
                .id(20L)
                .villianName("catMan")
                .build();

        villainListExpected = new ArrayList<>();
        villainListExpected.add(catWoman);
        villainListExpected.add(catMan);
    }


    @Test
    @DisplayName("Verify that seed data is called")
    public void verifySeedDataCallsDatabase() {
        Mockito.verify(villianRepository).save(catWoman);
        Mockito.verify(villianRepository).save(catMan);
    }

}