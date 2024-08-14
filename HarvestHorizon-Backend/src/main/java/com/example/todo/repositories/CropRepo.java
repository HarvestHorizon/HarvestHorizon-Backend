package com.example.todo.repositories;
import java.util.List;

import com.example.todo.model.CropModel;
import com.example.todo.model.SoilType;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todo.model.Season;
import com.example.todo.model.LandSize;
import com.example.todo.model.SoilType;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.QueryCreationException;

@Repository
public interface CropRepo extends JpaRepository<CropModel, Integer> {
    List<CropModel> findCropsBySoilType(SoilType soilType);

    List<CropModel> findByLandsizeAndSeasonAndSoilType(LandSize landsize,Season season,SoilType soilType);
}
