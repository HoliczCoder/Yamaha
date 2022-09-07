package com.yamaha.service;

import com.yamaha.model.Category;
import com.yamaha.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;


    public Boolean addCategory(Category category)  {

            boolean exist = categoryRepository.existsCategoriesByName(category.getName());
            if (exist) {
                System.out.println("Da ton tai");
                return false;
           } else {
               categoryRepository.save(category);
                return true;
            }


    }
}
