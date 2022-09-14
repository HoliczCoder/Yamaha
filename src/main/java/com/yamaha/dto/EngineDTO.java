package com.yamaha.dto;

import com.yamaha.entity.ChassisEntity;
import com.yamaha.entity.EngineEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EngineDTO {
    private Long id;
    private String description;
    public static EngineDTO entityToDTO (EngineEntity engineEntity){
        return EngineDTO.builder().description(engineEntity.getDescription()).build();
    }
}
