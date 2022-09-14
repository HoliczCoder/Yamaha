package com.yamaha.repository;

import com.yamaha.entity.ChassisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChassisRepository extends JpaRepository<ChassisEntity, Long> {
}
