package com.yamaha.dto;


import com.yamaha.entity.DimensionEntity;
import com.yamaha.entity.EngineEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DimensionDTO {
    private Long id;
    private String lwh;
    private String seatHeight;
    private String wheelBase;
    private String rake;
    private String trail;
    private String maximumGroundClearance;
    private String fuelCapacity;
    private String wetWeight;
    public static DimensionDTO entityToDTO (DimensionEntity dimensionEntity){
        return DimensionDTO.builder().id(dimensionEntity.getId()).lwh(dimensionEntity.getLwh()).seatHeight(dimensionEntity.getSeatHeight()).wheelBase(dimensionEntity.getWheelBase()).rake(dimensionEntity.getRake()).trail(dimensionEntity.getTrail()).maximumGroundClearance(dimensionEntity.getMaximumGroundClearance()).fuelCapacity(dimensionEntity.getFuelCapacity()).wetWeight(dimensionEntity.getWetWeight()).build();
    }

}
