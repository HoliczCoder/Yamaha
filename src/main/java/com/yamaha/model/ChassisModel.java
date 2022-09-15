package com.yamaha.model;


import com.yamaha.entity.ChassisEntity;
import com.yamaha.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChassisModel {
    private Long id;
    private String suspensionFront;
    private String suspensionRear;
    private String brakesFront;
    private String brakesRear;
    private String tiresFront;
    private String tiresRear;

    // cho phia duoi la build model thanh entity
    public static ChassisEntity ModelToEntity(@NotNull ChassisModel chassisModel) {

        return ChassisEntity.builder().id(chassisModel.getId()).suspensionFront(chassisModel.getSuspensionFront()).suspensionRear(chassisModel.getSuspensionRear()).brakesFront(chassisModel.getBrakesFront()).brakesRear(chassisModel.getBrakesRear()).tiresFront(chassisModel.getTiresFront()).tiresRear(chassisModel.getTiresRear()).build();
    }


}

