package com.example.todo.model;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="payment")
public class Payment {
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
    @MapsId
    @JoinColumn(name="order_id")
    private OrderModel order;
    @Column
    private  LocalDateTime PaidTime;

}
