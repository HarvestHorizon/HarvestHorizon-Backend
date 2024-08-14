package com.example.todo.model;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name="users")
public class UserModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Integer id;
    @NotNull
    @Column
    private String firstname;
    @NotNull
    @Column
    private String lastname;
    @NotNull
    @Column
    private String email_id;
    @NotNull
    @Column
    private String password;
    @NotNull
    @Column
    private String confirm_password;
    @NotNull
    @Column
    private String phone_no;

}
