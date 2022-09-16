package com.yamaha.service;

import com.yamaha.entity.SpecificationEntity;
import com.yamaha.repository.SpecificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecificationServiceImpl implements SpecificationService{
    @Autowired
    SpecificationRepository specificationRepository;

    @Override
    public void add(SpecificationEntity specificationEntity) {
        specificationRepository.save(specificationEntity);
    }

    @Override
    public SpecificationEntity findById(Long specification_id) {
        return specificationRepository.findById(specification_id).get();
    }
}
