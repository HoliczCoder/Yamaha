package com.yamaha.model;

import com.yamaha.entity.DimensionEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DimensionModel {
    private Long id;
    private String description;

    // cho phia duoi la build model thanh entity
    public static DimensionEntity ModelToEntity(DimensionModel dimensionModel) {
        return DimensionEntity.builder().description(dimensionModel.getDescription()).build();
    }
}
