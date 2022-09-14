package com.yamaha.controller;


import com.yamaha.dto.ResponseDTO;
import com.yamaha.model.ChassisModel;
import com.yamaha.service.ChassisService;
import com.yamaha.service.ChassisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/chassis")
public class ChassisController {
    @Autowired
    ChassisService chassisService;
    @Autowired
    ChassisServiceImpl chassisServiceImpl;


    @PostMapping
    public Object addProductChassis(ChassisModel chassisModel) {
        return ResponseDTO.of(chassisService.add(chassisModel), "Add product successful");
    }

    @GetMapping
    public Object getProductChassis( Long id) {
        return chassisService.findById (id);
    }

    ;
}
