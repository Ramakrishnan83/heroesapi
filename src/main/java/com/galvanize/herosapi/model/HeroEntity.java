package com.galvanize.herosapi.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class HeroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
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