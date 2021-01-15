package com.galvanize.herosapi.service;

import com.galvanize.herosapi.Repository.VillianRepository;
import com.galvanize.herosapi.model.HeroEntity;
import com.galvanize.herosapi.model.VillianEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VillianService {
    VillianEntity villainEntity ;
    List <VillianEntity> villianEntityList;
    VillianRepository villianRepository;

    public VillianService(VillianRepository villianRepository) {
        this.villianRepository = villianRepository;
        seedData();
    }
    private void seedData(){
      villainEntity = VillianEntity.builder()
              .id(10L)
              .villianName("catWoman")
              .build();
      villianEntityList = new ArrayList<>();
      villianRepository.save(villainEntity);
      villainEntity = VillianEntity.builder()
                .id(20L)
                .villianName("catMan")
                .build();
      villianRepository.save(villainEntity);
  }

    public List<VillianEntity> fetchAllVillians() {
        villianEntityList = villianRepository.findAll();
        return this.villianEntityList;
    }


}
