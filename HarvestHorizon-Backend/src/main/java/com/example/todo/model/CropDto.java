package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CropDto {
    private CropModel cropmodel;
    private List<Fertilizer> fertilizers;
    private List<Pesticide> pesticides;
}
