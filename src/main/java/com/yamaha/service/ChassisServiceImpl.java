package com.yamaha.service;

import com.yamaha.dto.ChassisDTO;
import com.yamaha.entity.ChassisEntity;
import com.yamaha.model.ChassisModel;
import com.yamaha.repository.ChassisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChassisServiceImpl implements ChassisService {
    @Autowired
    ChassisRepository chassisRepository;

    @Override
    public Object add(ChassisModel chassisModel) {
        ChassisEntity chassisEntity = ChassisModel.ModelToEntity(chassisModel);
        return chassisRepository.save(chassisEntity);
        // chac la okie roi
    }

    @Override
    public Object findById(Long id) {
        return chassisRepository.findById(id);
        // chac la okie r
    }
}
