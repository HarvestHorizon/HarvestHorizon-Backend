package com.example.todo.services;

import com.example.todo.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CropService {
    CropModel insert(CropModel cropmodel);
    List<CropModel> getcrop();
    CropModel getcropById(Integer id);
    List<CropModel> findBySoilType(SoilType soilType);
    List<CropModel> findCrops(LandSize landsize,Season season,SoilType soiltype );
    List<Fertilizer> findFertilizersByCropId(Integer crop_id);
    List<Pesticide> findPestictideByCropId(Integer crop_id);


}
