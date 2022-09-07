package com.yamaha.controller;


import com.yamaha.model.Category;
import com.yamaha.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService categoryServiceImpl;

    @PostMapping
    public ResponseEntity<Boolean> addCategory(@RequestBody @Valid Category category){
//        categoryServiceDTO.addCategory(category);
//        System.out.println("hello world");
        return ResponseEntity.ok(categoryServiceImpl.addCategory(category));
    }

    @DeleteMapping


}
