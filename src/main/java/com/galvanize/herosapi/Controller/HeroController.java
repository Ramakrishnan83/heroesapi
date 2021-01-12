package com.galvanize.herosapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("heroes")
public class HeroController {

    @GetMapping
    public List<String> fetchAll() {
        return null;
    }

}
