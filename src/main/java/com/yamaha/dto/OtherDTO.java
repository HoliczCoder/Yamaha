package com.yamaha.dto;

import com.yamaha.entity.DimensionEntity;
import com.yamaha.entity.OtherEntity;
import com.yamaha.model.OtherModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OtherDTO {
    private Long id;
    private String description;
    public static OtherDTO entityToDTO (OtherEntity otherEntity){
        return OtherDTO.builder().description(otherEntity.getDescription()).build();
    }
}
