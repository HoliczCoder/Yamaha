package com.yamaha.model;


import com.yamaha.entity.ChassisEntity;
import com.yamaha.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChassisModel  {
    private Long id;
    private String description;

    // cho phia duoi la build model thanh entity
    public static ChassisEntity ModelToEntity(ChassisModel chassisModel) {
        return ChassisEntity.builder().description(chassisModel.getDescription()).build();
    }


}
