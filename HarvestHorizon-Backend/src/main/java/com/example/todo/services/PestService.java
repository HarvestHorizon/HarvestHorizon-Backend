package com.example.todo.services;

import com.example.todo.model.Pesticide;
import org.springframework.stereotype.Service;


import java.util.List;
public interface PestService {
    Pesticide insert(Pesticide pesticide);
    List<Pesticide> getpest();
    Pesticide getPestById(Integer id);
    List<Pesticide> getPesticideByCropId(Integer crop_id);
}

