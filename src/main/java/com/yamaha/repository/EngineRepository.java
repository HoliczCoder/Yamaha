package com.yamaha.repository;

import com.yamaha.entity.EngineEntity;
import com.yamaha.model.EngineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineRepository extends JpaRepository<EngineEntity, Long> {
}
