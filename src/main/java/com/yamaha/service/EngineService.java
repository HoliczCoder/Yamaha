package com.yamaha.service;

import com.yamaha.entity.EngineEntity;
import com.yamaha.model.EngineModel;

public interface EngineService {
    Object add(EngineModel engineModel);

    EngineEntity findById(Long engine_id);
}
