package com.yamaha.service;

import com.yamaha.model.Category;
import com.yamaha.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        try {
            categoryRepository.findByCategory(category.getCategory());
//            if (){}
             return categoryRepository.save(category);
        } catch (Exception e) {
            throw new RuntimeException("khong add vao duoc");
        }

    }
}
