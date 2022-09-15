package com.yamaha.service;

import com.yamaha.entity.DimensionEntity;
import com.yamaha.model.ChassisModel;
import com.yamaha.model.DimensionModel;
import com.yamaha.repository.DimensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DimensionServiceImpl implements DimensionService{
    @Autowired
    DimensionRepository dimensionRepository;

    @Override
    public Object add(DimensionModel dimensionModel) {
        DimensionEntity dimensionEntity =  DimensionModel.ModelToEntity(dimensionModel);
        dimensionEntity =  dimensionRepository.save(dimensionEntity);
        return dimensionEntity;
        // chac la okie roi
    }
}
