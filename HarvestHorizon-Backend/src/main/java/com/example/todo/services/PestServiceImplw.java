package com.example.todo.services;

import com.example.todo.model.Pesticide;

import com.example.todo.repositories.PestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PestServiceImplw implements PestService {
    @Autowired

    PestRepo pestrepo;


    @Override
    public Pesticide insert(Pesticide pesticide) {
        return pestrepo.save(pesticide);
    }

    @Override
    public List<Pesticide> getpest() {
        List<Pesticide> p=new ArrayList<>();
        pestrepo.findAll().forEach(p::add);
        return p;
    }

    @Override
    public Pesticide getPestById(Integer id) {

        return pestrepo.findById(id).get();
    }
@Override
    public List<Pesticide> getPesticideByCropId(Integer crop_id){

        return pestrepo.findByCropId(crop_id);
   }
}
