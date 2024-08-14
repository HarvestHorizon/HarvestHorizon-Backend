package com.example.todo.controller;

import com.example.todo.model.*;
import com.example.todo.services.CropService;
import com.example.todo.services.FertService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/crop")
public class CropController {
    private CropService cropservice;
    public CropController(CropService cropservice) {
        this.cropservice = cropservice;
    }
    @GetMapping("/crop")
    public ResponseEntity<List<CropModel>> getcrop(){
        List<CropModel> c=cropservice.getcrop();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    @GetMapping("/crop_id")
    public CropModel getCropById(@PathVariable("crop_id") Integer id){
        return cropservice.getcropById(id);}
    @GetMapping("/crop/soiltype")
    public  ResponseEntity<List<CropModel>> findBySoilType(@PathVariable ("soiltype")SoilType soiltype){
        List<CropModel> cr=cropservice.findBySoilType(soiltype);
        return new ResponseEntity<>(cr,HttpStatus.OK);
    }
    @GetMapping("/recommendations/{land}/{season}/{soil}")
    public ResponseEntity<List<CropDto>>getRecommendedCrops(@PathVariable("land") LandSize landsize,@PathVariable("season") Season season,@PathVariable("soil") SoilType soilType){
        List<CropModel>crops= cropservice.findCrops(landsize,season,soilType);
        List<CropDto> rec=new ArrayList<>();
        for(CropModel c:crops){
            List<Fertilizer> fertilizers=cropservice.findFertilizersByCropId(c.getId());
            List<Pesticide> pesticides=cropservice.findPestictideByCropId(c.getId());
            CropDto dto=new CropDto();
            dto.setCropmodel(c);
            dto.setFertilizers(fertilizers);
            dto.setPesticides(pesticides);
            rec.add(dto);
        }
        return new ResponseEntity<>(rec,HttpStatus.OK);
    }
    @PostMapping("/cropinsert")
    public ResponseEntity<CropModel> savecrop(@RequestBody CropModel crops) {

        CropModel cropmodel1 = cropservice.insert(crops);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Crop", "/api/v1/crop");
        return new ResponseEntity<>(cropmodel1, httpHeaders, HttpStatus.CREATED);

    }
}

