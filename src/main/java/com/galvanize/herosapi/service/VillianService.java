package com.galvanize.herosapi.service;

import com.galvanize.herosapi.model.HeroEntity;
import com.galvanize.herosapi.model.VillianEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VillianService {
    VillianEntity villainEntity ;
    List <VillianEntity> villianEntityList;

    public VillianService() {
        seedData();
    }

    private void seedData(){
      villainEntity = VillianEntity.builder()
              .id(10L)
              .villianName("cat Woman")
              .build();
      villianEntityList = new ArrayList<>();
      villianEntityList.add(villainEntity);
  }
    public List<VillianEntity> fetchAllVillians() {
        return this.villianEntityList;
    }

}
