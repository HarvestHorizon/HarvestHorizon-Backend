package com.example.todo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
