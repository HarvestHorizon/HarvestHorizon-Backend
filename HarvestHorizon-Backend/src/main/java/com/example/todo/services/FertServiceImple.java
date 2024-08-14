package com.example.todo.services;

import com.example.todo.model.Fertilizer;
import com.example.todo.model.Pesticide;
import com.example.todo.repositories.FertRepo;
import com.example.todo.repositories.PestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FertServiceImple implements FertService {
    @Autowired
    FertRepo fertrepo;
    @Override
    public Fertilizer insert(Fertilizer fertilizer) {
        return fertrepo.save(fertilizer);
    }

    @Override
    public List<Fertilizer> getfert() {
        List<Fertilizer> f=new ArrayList<>();
        fertrepo.findAll().forEach(f::add);
        return f;
    }

    @Override
    public Fertilizer getfertById(Integer id) {
        return fertrepo.findById(id).get();
    }
    @Override
    public List<Fertilizer> getFertilizerByCropId(Integer crop_id) {
        return fertrepo.findByCropId(crop_id);
    }
}
