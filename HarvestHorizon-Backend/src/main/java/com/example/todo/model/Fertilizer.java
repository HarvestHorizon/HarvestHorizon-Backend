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
@Table(name="fertilizers")
public class Fertilizer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Column
    private Double price;
    @NotNull
    @Column
    private String name;
    @NotNull
    @Column
    private String type;
    @NotNull
    @JoinColumn(name="crop_id")
    @OneToOne
    private CropModel crop;
    @NotNull
    @Column
    private String description;
}