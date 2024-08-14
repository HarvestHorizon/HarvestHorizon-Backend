package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orderitem")
public class OrderItem {
    @Id@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Column
    private Double Amount;
    @NotNull
    @OneToOne
    @MapsId
    @JoinColumn(name="user_id")
    private UserModel user;
    @NotNull
    @OneToOne
    @MapsId
    @JoinColumn(name="crop_id")
     private CropModel crop;
    @NotNull@OneToOne
    @MapsId
    @JoinColumn(name="pest_id")
    private Pesticide pesticide;
    @NotNull
    @OneToOne
    @MapsId
    @JoinColumn(name="fest_id")
    private Fertilizer fertilizer;


}
