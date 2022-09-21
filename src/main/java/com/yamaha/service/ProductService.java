package com.yamaha.service;

import com.yamaha.dto.ProductDTO;
import com.yamaha.entity.ProductEntity;
import com.yamaha.model.ProductModel;

import java.util.List;

public interface ProductService {
    void add(ProductModel productModel);

    ProductEntity findById(Long product_id);

    void update(ProductEntity productEntity);

    List<ProductDTO> getProductByCategoryId(Long category_id);
}
