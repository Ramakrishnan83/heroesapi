package com.galvanize.herosapi.Controller;

import com.galvanize.herosapi.model.VillianEntity;
import com.galvanize.herosapi.service.VillianService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("villians")
public class VillianController {
VillianService villianService;

    public VillianController(VillianService villianService) {
        this.villianService = villianService;
    }

    @GetMapping
    public List<VillianEntity> getAllVillians(){
        return this.villianService.fetchAllVillians();
    }
}
