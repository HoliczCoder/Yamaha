package com.yamaha.repository;

import com.yamaha.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query (value = "SELECT * FROM product WHERE category_id = ?1", nativeQuery = true)
    List<ProductEntity> findProductByCategoryId(Long category_id);
}
