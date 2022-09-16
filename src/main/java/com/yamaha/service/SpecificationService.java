package com.yamaha.service;

import com.yamaha.entity.SpecificationEntity;

public interface SpecificationService {
    void add(SpecificationEntity specificationEntity);

    SpecificationEntity findById(Long specification_id);
}
