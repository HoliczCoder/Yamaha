package com.yamaha.controller;


import com.yamaha.model.MotorcycleCat;
import com.yamaha.service.MotorcycleCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/motorcycle-category")
public class MotorcycleCatController {
    @Autowired
    MotorcycleCatService motorcycleCatServiceImpl;

    @PostMapping
    public ResponseEntity<Boolean> addCategory(@RequestBody @Valid MotorcycleCat motorcycleCat) {
//        categoryServiceDTO.addCategory(category);
//        System.out.println("hello world");
        return ResponseEntity.ok(motorcycleCatServiceImpl.addCategory(motorcycleCat));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        String response = motorcycleCatServiceImpl.removeCategoryById(id);
        return ResponseEntity.ok(response);
    }
    @GetMapping
    public ResponseEntity<List<MotorcycleCat>> getAllCategory() {
        return ResponseEntity.ok(motorcycleCatServiceImpl.getAllCategory()
        );
    }


}
