package com.yamaha.model;

import com.yamaha.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
    private Long id;
    private String name;
    //    private MotorcycleCat motorcycleCat;
    private String slogan;
    private String description;
    //    private SpecificationEntity specification;
//    private AccessoriesEntity accessories;
//    private FeatureEntity feature;
//    private List<YearModelEntity> yearModel;
//    private GalleryEntity gallery;
//    private String view;
    private String currentOffer;

    public static ProductEntity modelToEntity(ProductModel productModel) {
        return ProductEntity.builder().slogan(productModel.getSlogan()).id(productModel.getId()).name(productModel.getName()).description(productModel.getDescription()).currentOffer(productModel.getCurrentOffer()).build();
    }


}
