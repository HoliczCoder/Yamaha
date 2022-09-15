package com.yamaha.controller;

import com.yamaha.entity.ChassisEntity;
import com.yamaha.entity.DimensionEntity;
import com.yamaha.entity.EngineEntity;
import com.yamaha.entity.SpecificationEntity;
import com.yamaha.repository.ChassisRepository;
import com.yamaha.repository.DimensionRepository;
import com.yamaha.repository.EngineRepository;
import com.yamaha.repository.SpecificationRepository;
import com.yamaha.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/specification")
public class SpecificationController {
    @Autowired
    SpecificationService specificationService;
    @Autowired
    ChassisRepository chassisRepository;
    @Autowired
    EngineRepository engineRepository;
    @Autowired
    DimensionRepository dimensionRepository;
    @Autowired
    SpecificationRepository specificationRepository;

    @PostMapping("/chassis/{chassis_id}/dimension/{dimension_id}/engine/{engine_id}")
    public Object addProductSpecification (@PathVariable Long chassis_id, @PathVariable Long dimension_id, @PathVariable Long engine_id ){
        ChassisEntity chassisEntity = chassisRepository.findById(chassis_id).get();
        EngineEntity engineEntity = engineRepository.findById(engine_id).get();
        DimensionEntity dimensionEntity = dimensionRepository.findById(dimension_id).get();
        SpecificationEntity specificationEntity = new SpecificationEntity();
//        specificationEntity.setChassis(chassisEntity);
//        specificationEntity.setDimension(dimensionEntity);
//        specificationEntity.setEngine(engineEntity);
        chassisEntity.setSpecification(specificationEntity);
        engineEntity.setSpecification(specificationEntity);
        dimensionEntity.setSpecification(specificationEntity);
        chassisRepository.save(chassisEntity);
        engineRepository.save(engineEntity);
        dimensionRepository.save(dimensionEntity);
        return ("okie");
    };




}
