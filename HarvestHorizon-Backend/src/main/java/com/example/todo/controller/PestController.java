package com.example.todo.controller;

import com.example.todo.model.Fertilizer;
import com.example.todo.model.Pesticide;
import com.example.todo.model.UserModel;
import com.example.todo.services.PestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Pesticide")
public class PestController {
    @Autowired
     private PestService pestservice;
  /*  public PestController(PestService pestservice) {
        this.pestservice = pestservice;}*/
        @PostMapping
        public ResponseEntity<Pesticide> savepest (@Valid @RequestBody Pesticide pesticides){
            Pesticide pestmodel1 = pestservice.insert(pesticides);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("pest", "/api/v1/Pesticide");
            return new ResponseEntity<>(pestmodel1, httpHeaders, HttpStatus.CREATED);
        }

    @GetMapping("/pesticides/{crop_id}")
    public ResponseEntity<List<Pesticide>> getPesticideByCropId(@PathVariable("crop_id") Integer crop_id){
        List<Pesticide> p=pestservice.getPesticideByCropId(crop_id);
        return new ResponseEntity<>(p,HttpStatus.OK);

    }
}




