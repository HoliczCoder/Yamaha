package com.yamaha.dto;

import com.yamaha.entity.ChassisEntity;
import com.yamaha.entity.DimensionEntity;
import com.yamaha.entity.EngineEntity;
import com.yamaha.entity.SpecificationEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpecificationDTO {
    private Long id;
    private Long idChassis;
    private Long idDimension;
    private Long idEngine;

    public static SpecificationDTO entityToDTO(SpecificationEntity specificationEntity){
       return SpecificationDTO.builder().id(specificationEntity.getId()).idChassis(specificationEntity.getChassis().getId()).idDimension(specificationEntity.getDimension().getId()).idEngine(specificationEntity.getEngine().getId()).build();
    }

}
