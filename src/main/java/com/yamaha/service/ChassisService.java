package com.yamaha.service;

import com.yamaha.entity.ChassisEntity;
import com.yamaha.model.ChassisModel;

public interface ChassisService {

    Object add(ChassisModel chassisModel);

    ChassisEntity findById(Long id);
}
