package com.yamaha.service;

import com.yamaha.model.DimensionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DimensionService  {
    Object add(DimensionModel dimensionModel);
}
