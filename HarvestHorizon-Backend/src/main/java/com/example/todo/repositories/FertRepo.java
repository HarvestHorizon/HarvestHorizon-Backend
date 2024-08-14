package com.example.todo.repositories;
import java.util.List;
import com.example.todo.model.Fertilizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface FertRepo extends JpaRepository<Fertilizer,Integer> {
   List<Fertilizer> findByCropId(Integer crop_id);
}
