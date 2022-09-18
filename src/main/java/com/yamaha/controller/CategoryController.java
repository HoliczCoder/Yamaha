package com.yamaha.controller;

import com.yamaha.entity.CategoryEntity;
import com.yamaha.model.CategoryModel;
import com.yamaha.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping
    public Object getCategory (@RequestBody CategoryModel categoryModel){
        categoryService.add(categoryModel);
        return  ("oke");
    };
}
