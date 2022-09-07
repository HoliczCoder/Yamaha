package com.yamaha.service;

import com.yamaha.model.MotorcycleCat;

import java.util.List;

public interface MotorcycleCatService {
    public Boolean addCategory(MotorcycleCat motorcycleCat);

    public String removeCategoryById(Long id);

    public List<MotorcycleCat> getAllCategory();
}
