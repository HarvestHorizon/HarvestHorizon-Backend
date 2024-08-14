package com.example.todo.repositories;

import com.example.todo.model.Pesticide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PestRepo extends JpaRepository<Pesticide,Integer> {
    List<Pesticide> findByCropId(Integer crop_id);
}
