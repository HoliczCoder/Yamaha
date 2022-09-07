package com.yamaha.service;

import com.yamaha.model.Category;
import com.yamaha.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Boolean addCategory(Category category) {

        boolean exist = categoryRepository.existsCategoriesByName(category.getName());
        if (exist) {
            System.out.println("Da ton tai");
            return false;
        } else {
            categoryRepository.save(category);
            return true;
        }


    }

    @Override
    public String removeCategoryById(Long id) {
        categoryRepository.findById(id);
        if (categoryRepository.findById(id).isPresent()){
            categoryRepository.deleteById(id);
            return ("xoa thanh cong");
        }
        else {
            return ("xoa that bai");
        }
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }


}
