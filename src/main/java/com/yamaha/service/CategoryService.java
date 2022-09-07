package com.yamaha.service;

import com.yamaha.model.Category;

import java.util.List;

public interface CategoryService {
    public Boolean addCategory(Category category);

    public String removeCategoryById(Long id);

    public List<Category> getAllCategory();
}
