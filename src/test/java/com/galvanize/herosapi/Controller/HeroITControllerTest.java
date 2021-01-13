package com.galvanize.herosapi.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.herosapi.model.HeroDto;
import com.galvanize.herosapi.service.HeroService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HeroITControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    @DisplayName("Get All heroes")
    void getAllHeroes() throws Exception {
        mockMvc.perform(get("/heroes"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("[0].id").value(1))
                .andExpect(jsonPath("[0].heroName").value("wonderMan"));
    }

    @Test
    @DisplayName("Get one hero")
    void getOneHero() throws Exception {
        mockMvc.perform(get("/heroes/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id").value("1"))
                .andExpect(jsonPath("heroName").value("wonderMan"));

        mockMvc.perform(get("/heroes/23"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id").value("23"))
                .andExpect(jsonPath("heroName").value("wonder woman"));
    }
}