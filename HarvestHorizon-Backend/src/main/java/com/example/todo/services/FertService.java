package com.example.todo.services;

import com.example.todo.model.Fertilizer;
import com.example.todo.model.Pesticide;

import java.util.List;

public interface FertService {
    Fertilizer insert(Fertilizer fertilizer);
    List<Fertilizer> getfert();
    Fertilizer getfertById(Integer id);
    List<Fertilizer> getFertilizerByCropId(Integer id);
}

