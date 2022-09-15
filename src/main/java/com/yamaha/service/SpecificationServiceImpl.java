package com.yamaha.service;

import com.yamaha.repository.SpecificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecificationServiceImpl implements SpecificationService{
    @Autowired
    SpecificationRepository specificationRepository;

}
