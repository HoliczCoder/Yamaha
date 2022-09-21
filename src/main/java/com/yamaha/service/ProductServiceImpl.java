package com.yamaha.service;

import com.amazonaws.services.directory.model.RegisterEventTopicRequest;
import com.yamaha.dto.ProductDTO;
import com.yamaha.entity.ProductEntity;
import com.yamaha.model.ProductModel;
import com.yamaha.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<ProductDTO> getProductByCategoryId(Long category_id) {
       List<ProductEntity> productEntities = productRepository.findProductByCategoryId(category_id);

       return productEntities.stream().map( ProductDTO::entityToDTO).collect(Collectors.toList());
    }
}
