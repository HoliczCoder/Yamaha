package com.yamaha.controller;

import com.yamaha.dto.ResponseDTO;
import com.yamaha.model.DimensionModel;
import com.yamaha.service.DimensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/dimension")
public class DimensionController {
    @Autowired
    DimensionService dimensionService;

    @PostMapping
    public Object addProductDimension(@RequestBody DimensionModel dimensionModel) {
        return ResponseDTO.of(dimensionService.add(dimensionModel), "thanh cong");
    }

    ;

}
