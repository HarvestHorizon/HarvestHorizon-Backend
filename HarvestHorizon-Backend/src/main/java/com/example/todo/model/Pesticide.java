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
@Table(name="pesticides")
public class Pesticide {
    @Id@Column
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
    @OneToOne
    @JoinColumn(name="crop_id")
    private CropModel crop;
    @NotNull
    @Column
    private String description;
}
