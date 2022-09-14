package com.yamaha.dto;

import com.yamaha.entity.ChassisEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChassisDTO {
    private Long id;
    private String description;
    public static ChassisDTO entityToDTO (ChassisEntity chassisEntity){
        return ChassisDTO.builder().description(chassisEntity.getDescription()).build();
    }
}
