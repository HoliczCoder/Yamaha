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
    private String description;

    // cho phia duoi la build model thanh entity
    public static EngineEntity ModelToEntity(EngineModel engineModel) {
        return EngineEntity.builder().description(engineModel.getDescription()).build();
    }
}
