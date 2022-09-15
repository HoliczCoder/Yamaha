package com.yamaha.repository;

import com.yamaha.entity.DimensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionRepository extends JpaRepository<DimensionEntity, Long> {
}
