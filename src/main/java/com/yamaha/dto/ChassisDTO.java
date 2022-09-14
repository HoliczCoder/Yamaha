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
    private String suspensionFront;
    private String suspensionRear;
    private String brakesFront;
    private String brakesRear;
    private String tiresFront;
    private String tiresRear;
    public static ChassisDTO entityToDTO (ChassisEntity chassisEntity){
        return ChassisDTO.builder().suspensionFront(chassisEntity.getSuspensionFront()).suspensionRear(chassisEntity.getSuspensionRear()).brakesFront(chassisEntity.getBrakesFront()).brakesRear(chassisEntity.getBrakesRear()).tiresFront(chassisEntity.getTiresFront()).tiresRear(chassisEntity.getTiresRear()).build();
    }
}
