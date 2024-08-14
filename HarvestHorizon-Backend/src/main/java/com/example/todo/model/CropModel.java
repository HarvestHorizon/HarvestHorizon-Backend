package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="crops")
public class CropModel{
    @Id@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Column
    private String name;
    @NotNull
    @Column
    @Enumerated(EnumType.STRING)
    CropType crop_type;
    @NotNull
    @Column
    @Enumerated(EnumType.STRING)
     Season season;
    @NotNull
    @Column
    @Enumerated(EnumType.STRING)
    SoilType soilType;
    @NotNull
    @Column
    @Enumerated(EnumType.STRING)
    LandSize landsize;
    @NotNull
    @Column
    private Double price;
    @NotNull
    @Column
    private String description;
}