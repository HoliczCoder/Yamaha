package com.yamaha.model;

import com.yamaha.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel {
    private Long id;
    private String categoryProduct;

    public static CategoryEntity modelToDTO (CategoryModel categoryModel){
       return CategoryEntity.builder().id(categoryModel.getId()).categoryProduct(categoryModel.getCategoryProduct()).build();
    };
}
