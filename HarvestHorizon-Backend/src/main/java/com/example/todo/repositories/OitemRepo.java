package com.example.todo.repositories;

import com.example.todo.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OitemRepo extends JpaRepository<OrderItem,Integer> {
}
