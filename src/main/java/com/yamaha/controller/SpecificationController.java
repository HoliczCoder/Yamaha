package com.yamaha.controller;

import com.yamaha.dto.SpecificationDTO;
import com.yamaha.entity.ChassisEntity;
import com.yamaha.entity.DimensionEntity;
import com.yamaha.entity.EngineEntity;
import com.yamaha.entity.SpecificationEntity;
import com.yamaha.repository.ChassisRepository;
import com.yamaha.repository.DimensionRepository;
import com.yamaha.repository.EngineRepository;
import com.yamaha.repository.SpecificationRepository;
import com.yamaha.service.ChassisService;
import com.yamaha.service.DimensionService;
import com.yamaha.service.EngineService;
import com.yamaha.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/specification")
public class SpecificationController {
    @Autowired
    SpecificationService specificationService;
    @Autowired
    ChassisService chassisService;
    @Autowired
    EngineService engineService;
    @Autowired
    DimensionService dimensionService;
    @Autowired
    ChassisRepository chassisRepository;
    @Autowired
    EngineRepository engineRepository;
    @Autowired
    DimensionRepository dimensionRepository;
    @Autowired
    SpecificationRepository specificationRepository;

    @PostMapping
    public Object addProductSpecification() {
        SpecificationEntity specificationEntity = new SpecificationEntity();
        specificationService.add(specificationEntity); // save lai cai de no tu ren ra id
        return ("okie");
    }

    @GetMapping("/{specification_id}")
    public Object getProductSpecification (@PathVariable Long specification_id){
        SpecificationEntity specificationEntity = specificationService.findById(specification_id);
        SpecificationDTO specificationDTO = SpecificationDTO.entityGoToDTO(specificationEntity);
        return (specificationDTO);
    };

    @PutMapping("{specification_id}/chassis/{chassis_id}/dimension/{dimension_id}/engine/{engine_id}")
    public Object modifyProductSpecification(@PathVariable Long specification_id, @PathVariable Long chassis_id, @PathVariable Long dimension_id, @PathVariable Long engine_id) {
        ChassisEntity chassisEntity = chassisService.findById(chassis_id);
        DimensionEntity dimensionEntity = dimensionService.findById(dimension_id);
        EngineEntity engineEntity = engineService.findById(engine_id);
        SpecificationEntity specificationEntity = specificationService.findById(specification_id);
        specificationEntity.setChassis(chassisEntity); // thêm chassis vào
        specificationEntity.setDimension(dimensionEntity); // thêm dimension vào
        specificationEntity.setEngine(engineEntity);   // thêm engine vào
        chassisEntity.setSpecificationEntityList(specificationEntity);
        engineEntity.setSpecification(specificationEntity);
        dimensionEntity.setSpecification(specificationEntity);
        chassisRepository.save(chassisEntity);
        engineRepository.save(engineEntity);
        dimensionRepository.save(dimensionEntity);
        return ("okie");
    }

    ;


}
