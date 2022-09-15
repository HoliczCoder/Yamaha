package com.yamaha.controller;

import com.yamaha.dto.ResponseDTO;
import com.yamaha.model.ChassisModel;
import com.yamaha.model.EngineModel;
import com.yamaha.service.EngineService;
import com.yamaha.service.EngineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/engine")
public class EngineController {
    @Autowired
    EngineServiceImpl engineServiceImpl;
    @Autowired
    EngineService engineService;

    @PostMapping
    public Object addProductEngine(@RequestBody EngineModel engineModel) {
        return ResponseDTO.of(engineService.add(engineModel), "thanh cong");
    }
}
