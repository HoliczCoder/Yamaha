package com.yamaha.controller;


import com.yamaha.model.Category;
import com.yamaha.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService categoryServiceDTO;

    @PostMapping
    public ResponseEntity<Category> addCategory(@RequestBody @Valid Category category) {
//        categoryServiceDTO.addCategory(category);
        return ResponseEntity.ok(categoryServiceDTO.addCategory(category));
    }

}
