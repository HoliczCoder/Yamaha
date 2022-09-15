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
    private String lwh;
    private String seatHeight;
    private String wheelBase;
    private String rake;
    private String trail;
    private String maximumGroundClearance;
    private String fuelCapacity;
    private String wetWeight;

    // cho phia duoi la build model thanh entity
    public static DimensionEntity ModelToEntity(DimensionModel dimensionModel) {
        return DimensionEntity.builder().lwh(dimensionModel.getLwh()).wheelBase(dimensionModel.getWheelBase()).seatHeight(dimensionModel.getSeatHeight()).rake(dimensionModel.getRake()).trail(dimensionModel.getTrail()).maximumGroundClearance(dimensionModel.getMaximumGroundClearance()).fuelCapacity(dimensionModel.getFuelCapacity()).wetWeight(dimensionModel.getWetWeight()).build();
    }
}
