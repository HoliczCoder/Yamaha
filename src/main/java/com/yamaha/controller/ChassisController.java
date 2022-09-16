package com.yamaha.controller;


import com.yamaha.dto.ChassisDTO;
import com.yamaha.dto.ResponseDTO;
import com.yamaha.entity.ChassisEntity;
import com.yamaha.model.ChassisModel;
import com.yamaha.service.ChassisService;
import com.yamaha.service.ChassisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/chassis")
public class ChassisController {
    @Autowired
    ChassisService chassisService;
    @Autowired
    ChassisServiceImpl chassisServiceImpl;


    @PostMapping
    public Object addProductChassis(@RequestBody ChassisModel chassisModel) {
        return ResponseDTO.of(chassisService.add(chassisModel), "thanh cong");
    }

    @GetMapping("{chassis_id}")
    public ChassisDTO getProductChassis(@PathVariable Long chassis_id) {
        ChassisEntity chassisEntity = chassisService.findById (chassis_id);
        ChassisDTO chassisDTO = ChassisDTO.entityToDTO(chassisEntity);
        return chassisDTO;
    }
    ;
}
