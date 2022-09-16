package com.yamaha.service;

import com.yamaha.entity.EngineEntity;
import com.yamaha.model.EngineModel;
import com.yamaha.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EngineServiceImpl implements EngineService{
    @Autowired
    EngineRepository engineRepository;

    @Override
    public Object add(EngineModel engineModel) {
        EngineEntity engineEntity = EngineModel.ModelToEntity(engineModel);
        engineEntity =  engineRepository.save(engineEntity);
        return engineEntity;
    }

    @Override
    public EngineEntity findById(Long engine_id) {
        return engineRepository.findById(engine_id).get();
    }
}
