package com.yamaha.model;

import com.yamaha.entity.OtherEntity;
import com.yamaha.entity.OtherEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OtherModel {
    private Long id;
    private String description;

    // cho phia duoi la build model thanh entity
    public static OtherEntity ModelToEntity(OtherModel otherModel) {
        return OtherEntity.builder().description(otherModel.getDescription()).build();
    }
}
