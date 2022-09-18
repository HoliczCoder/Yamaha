package com.yamaha.service;

import com.yamaha.model.CategoryModel;
import com.yamaha.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void add(CategoryModel categoryModel) {
        categoryRepository.save(CategoryModel.modelToDTO(categoryModel));
    }
}
