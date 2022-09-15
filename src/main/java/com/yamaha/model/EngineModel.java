package com.yamaha.model;

import com.yamaha.entity.EngineEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EngineModel {
    private Long id;
    private String engineType;
    private String boreStroke;
    private String compressionRatio;
    private String fuelDelivery;
    private String transmission;
    private String finalDrive;
    // cho phia duoi la build model thanh entity
    public static EngineEntity ModelToEntity(EngineModel engineModel) {
        return EngineEntity.builder().engineType(engineModel.getEngineType()).boreStroke(engineModel.getBoreStroke()).compressionRatio(engineModel.getCompressionRatio()).fuelDelivery(engineModel.getFuelDelivery()).transmission(engineModel.getTransmission()).finalDrive(engineModel.getFinalDrive()).build();
    }
}
