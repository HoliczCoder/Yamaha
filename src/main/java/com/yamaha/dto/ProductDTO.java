package com.yamaha.dto;

import com.yamaha.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Long category_id;
    private String slogan;
    private String description;
    private String coverImage;
    private String currentOffer;
    private Long specification_id;

    public static ProductDTO entityToDTO (ProductEntity productEntity){
        return ProductDTO.builder().id(productEntity.getId()).name(productEntity.getName()).category_id(productEntity.getMotorcycleCatEntity().getId()).slogan(productEntity.getSlogan()).description(productEntity.getDescription()).coverImage(productEntity.getCoverImage()).currentOffer(productEntity.getCurrentOffer()).specification_id(productEntity.getSpecification() != null ? productEntity.getSpecification().getId() : null).build();
    }


}
