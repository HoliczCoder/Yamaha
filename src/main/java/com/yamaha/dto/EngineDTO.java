package com.yamaha.dto;

import com.yamaha.entity.ChassisEntity;
import com.yamaha.entity.EngineEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.web.server.Compression;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EngineDTO {
    private Long id;
    private String engineType;
    private String boreStroke;
    private String compressionRatio;
    private String fuelDelivery;
    private String transmission;
    private String finalDrive;
    private List<SpecificationDTO> specificationDTOList;


    public static EngineDTO entityToDTO (EngineEntity engineEntity){
        return EngineDTO.builder().engineType(engineEntity.getEngineType()).boreStroke(engineEntity.getBoreStroke()).compressionRatio(engineEntity.getCompressionRatio()).fuelDelivery(engineEntity.getFuelDelivery()).transmission(engineEntity.getTransmission()).finalDrive(engineEntity.getFinalDrive()).build();
    }
}
