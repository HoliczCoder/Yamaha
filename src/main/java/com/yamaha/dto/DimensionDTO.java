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
    private String description;
    public static DimensionDTO entityToDTO (DimensionEntity dimensionEntity){
        return DimensionDTO.builder().description(dimensionEntity.getDescription()).build();
    }

}
