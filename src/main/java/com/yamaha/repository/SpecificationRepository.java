package com.yamaha.repository;

import com.yamaha.entity.SpecificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationRepository extends JpaRepository<SpecificationEntity, Long> {
}
