package com.yamaha.service;

import com.yamaha.entity.CategoryEntity;
import com.yamaha.entity.MotorcycleCatEntity;

import java.util.List;

public interface MotorcycleCatService {
    public Boolean addCategory(MotorcycleCatEntity motorcycleCatEntity);

    public String removeCategoryById(Long id);

    public List<MotorcycleCatEntity> getAllCategory();

    MotorcycleCatEntity findById(Long category_id);

    void updateCategory(MotorcycleCatEntity motorcycleCatEntity);
}
