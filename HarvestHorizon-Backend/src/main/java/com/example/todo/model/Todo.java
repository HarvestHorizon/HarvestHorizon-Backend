package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "todo")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    Long id;
    @Column
    String title;
    @Column
    String description;
    @Column
    TodoStatus todoStatus;

    @CreationTimestamp
    @Column(updatable = false)
    Timestamp dateCreated;
    @UpdateTimestamp
    Timestamp lastModified;

}
