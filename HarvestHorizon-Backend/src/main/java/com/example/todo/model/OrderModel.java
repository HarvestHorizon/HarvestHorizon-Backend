package com.example.todo.model;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
@Table(name="orders")
public class OrderModel {
    @Id@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Column
    private Long no_of_items;
    @NotNull
    @Column
    private Double total;
    @NotNull
    @OneToOne
    @MapsId
    @JoinColumn(name="user_id")
    private UserModel user;
    @Column
    private LocalDateTime orderedtime;

}
