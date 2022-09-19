package com.yamaha.controller;

import com.yamaha.entity.CategoryEntity;
import com.yamaha.entity.MotorcycleCatEntity;
import com.yamaha.entity.ProductEntity;
import com.yamaha.entity.SpecificationEntity;
import com.yamaha.model.MotorcycleCat;
import com.yamaha.model.ProductModel;
import com.yamaha.service.CategoryService;
import com.yamaha.service.MotorcycleCatService;
import com.yamaha.service.ProductService;
import com.yamaha.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    SpecificationService specificationService;
    @Autowired
    MotorcycleCatService motorcycleCatService;
    @PostMapping
    public Object addProduct (@RequestBody ProductModel productModel){
        productService.add(productModel);
        return ("okie");
    }

    @PutMapping("/{product_id}/specification/{specification_id}")
    public Object modifyProductToSpecification (@PathVariable Long product_id, @PathVariable Long specification_id ){
        ProductEntity productEntity = productService.findById(product_id);
        SpecificationEntity specificationEntity = specificationService.findById(specification_id);
        productEntity.setSpecification(specificationEntity);
        productService.update(productEntity);
        return ("okie");
    }

    @PutMapping("/{product_id}/motorcycle-cat/{category_id}")
    public Object modifyProductToMotorcycleCat (@PathVariable Long product_id, @PathVariable Long category_id ){
        ProductEntity productEntity = productService.findById(product_id);
        MotorcycleCatEntity motorcycleCatEntity = motorcycleCatService.findById(category_id);
        productEntity.setMotorcycleCatEntity(motorcycleCatEntity);
        productService.update(productEntity);
        return ("okie");
    }
}
