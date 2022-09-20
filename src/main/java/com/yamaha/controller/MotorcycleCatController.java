package com.yamaha.controller;


import com.amazonaws.services.dynamodbv2.xspec.L;
import com.yamaha.entity.MotorcycleCatEntity;
import com.yamaha.service.AmazonClient;
import com.yamaha.service.MotorcycleCatService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/motorcycle-category")
public class MotorcycleCatController {
    @Autowired
    MotorcycleCatService motorcycleCatService;

    @Autowired
    AmazonClient amazonClient;

    @PostMapping
    public ResponseEntity<Boolean> addCategory(@RequestBody @Valid MotorcycleCatEntity motorcycleCatEntity) {
//        categoryServiceDTO.addCategory(category);
//        System.out.println("hello world");
        return ResponseEntity.ok(motorcycleCatService.addCategory(motorcycleCatEntity));
    }

    @GetMapping
    public ResponseEntity<List<MotorcycleCatEntity>> getMotorcycleCat (){
        return  ResponseEntity.ok( motorcycleCatService.findAll());
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
//        String response = motorcycleCatService.removeCategoryById(id);
//        return ResponseEntity.ok(response);
//    }
//    @GetMapping
//    public ResponseEntity<List<MotorcycleCat>> getAllCategory() {
//        return ResponseEntity.ok(motorcycleCatService.getAllCategory()
//        );
//    }
    @PutMapping
    public Object modifiMotorcycleCategory (@RequestPart (value = "file") MultipartFile file, @RequestParam(value = "folder") String folderName,@RequestParam(value = "id") Long motorcycleCatId ){
        System.out.println(motorcycleCatId);
        String fileUrl = this.amazonClient.uploadFilewithFolder(file, folderName);
        MotorcycleCatEntity motorcycleCatEntity = motorcycleCatService.findById(motorcycleCatId);
        motorcycleCatEntity.setCategoryImage(fileUrl);
        motorcycleCatService.updateCategory(motorcycleCatEntity);
        return ("okie");
    }



}
