package com.galvanize.herosapi.Repository;

import com.galvanize.herosapi.model.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<HeroEntity, Integer>  {

    HeroEntity findByHeroName(String wonderWoman);
}



