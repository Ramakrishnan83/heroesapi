package com.galvanize.herosapi.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HeroDto {
    private String id;
    private String heroName;
    private String image;
    private String weight;
    private String height;
    private String specialPower;
    private String intelligence;
    private String strength;
    private String description;
    private String story;
    private String agility;
    private String power;
    private String speed;
}