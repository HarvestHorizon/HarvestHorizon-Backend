package com.example.todo.services;

import com.example.todo.model.*;
import com.example.todo.repositories.CropRepo;
import com.example.todo.repositories.FertRepo;
import com.example.todo.repositories.PestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CropServiceImple implements CropService{
    @Autowired
    CropRepo croprepo;
    @Autowired
    FertRepo fertrepo;
    @Autowired
    PestRepo pestrepo;

    @Override
    public CropModel insert(CropModel cropmodel) {
        return croprepo.save(cropmodel);}

    @Override
    public List<CropModel> getcrop() {
        List<CropModel> r = new ArrayList<>();
        croprepo.findAll().forEach(r::add);
        return r;
    }

    @Override
    public CropModel getcropById(Integer id) {

        return croprepo.findById(id).get();
    }

    public List<CropModel> findBySoilType(SoilType soilType){
        return croprepo.findCropsBySoilType(soilType);}
   @Override
    public List<Fertilizer> findFertilizersByCropId(Integer crop_id){
        return fertrepo.findByCropId(crop_id);
    }

@Override
    public List<Pesticide> findPestictideByCropId(Integer crop_id)
    {
        return pestrepo.findByCropId(crop_id);
}
@Override
    public List<CropModel> findCrops(LandSize landsize,Season season ,SoilType soilType){
        return croprepo.findByLandsizeAndSeasonAndSoilType(landsize,season,soilType);
}
}

