package com.yamaha.service;

import com.yamaha.entity.ProductEntity;
import com.yamaha.model.ProductModel;

public interface ProductService {
    void add(ProductModel productModel);

    ProductEntity findById(Long product_id);

    void update(ProductEntity productEntity);
}
