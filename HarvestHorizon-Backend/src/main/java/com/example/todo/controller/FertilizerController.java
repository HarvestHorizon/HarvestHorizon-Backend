package com.example.todo.controller;

import com.example.todo.model.Fertilizer;
import com.example.todo.model.Pesticide;
import com.example.todo.model.UserModel;
import com.example.todo.services.FertService;
import com.example.todo.services.PestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Fertilizer")
public class FertilizerController {
    @Autowired
    private FertService fertservice;
    @PostMapping
    public ResponseEntity<Fertilizer> savefert (@Valid @RequestBody Fertilizer fertilizer){
        Fertilizer fertmodel1 = fertservice.insert(fertilizer);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("fert", "/api/v1/Fertilizer");
        return new ResponseEntity<>(fertmodel1, httpHeaders, HttpStatus.CREATED);
    }

    @GetMapping("/fertilizer/{crop_id}")
    public ResponseEntity<List<Fertilizer>> getFertilizerByCropId(@PathVariable("crop_id") Integer id) {
        List<Fertilizer> f = fertservice.getFertilizerByCropId(id);
        return new ResponseEntity<>(f, HttpStatus.OK);
    }


}

