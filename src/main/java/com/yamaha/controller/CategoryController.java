package com.yamaha.controller;


import com.yamaha.model.Category;
import com.yamaha.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService categoryServiceImpl;

    @PostMapping
    public ResponseEntity<Boolean> addCategory(@RequestBody @Valid Category category) {
//        categoryServiceDTO.addCategory(category);
//        System.out.println("hello world");
        return ResponseEntity.ok(categoryServiceImpl.addCategory(category));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        String response = categoryServiceImpl.removeCategoryById(id);
        return ResponseEntity.ok(response);
    }
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategory() {
        return ResponseEntity.ok(categoryServiceImpl.getAllCategory()
        );
    }


}
