package com.galvanize.herosapi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class VillianEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String villianName;
    private String archRival;
    private String realName;
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
