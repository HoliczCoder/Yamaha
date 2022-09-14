package com.yamaha.service;

import com.yamaha.model.ChassisModel;

public interface ChassisService {

    Object add(ChassisModel chassisModel);

    Object findById(Long id);
}
