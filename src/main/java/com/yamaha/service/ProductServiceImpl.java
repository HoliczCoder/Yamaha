package com.yamaha.service;

import com.yamaha.entity.ProductEntity;
import com.yamaha.model.ProductModel;
import com.yamaha.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public void add(ProductModel productModel) {
        productRepository.save(ProductModel.modelToEntity(productModel));
    }

    @Override
    public ProductEntity findById(Long product_id) {
        return productRepository.findById(product_id).get();
    }

    @Override
    public void update(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }
}
