package com.yamaha.repository;

import com.yamaha.entity.MotorcycleCatEntity;
import com.yamaha.model.MotorcycleCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorcycleCatRepository extends JpaRepository<MotorcycleCatEntity, Long> {
    MotorcycleCat findByName (String name);
   // boolean existsCurrentAccountByAccountNumber(String accountNo);
    boolean existsCategoriesByName(String name);
}
