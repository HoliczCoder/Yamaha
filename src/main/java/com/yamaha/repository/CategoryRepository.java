package com.yamaha.repository;

import com.yamaha.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName (String name);
   // boolean existsCurrentAccountByAccountNumber(String accountNo);
    boolean existsCategoriesByName(String name);
}
