package com.yamaha.service;

import com.yamaha.entity.CategoryEntity;
import com.yamaha.entity.MotorcycleCatEntity;
import com.yamaha.repository.MotorcycleCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleCatServiceImpl implements MotorcycleCatService {
    @Autowired
    MotorcycleCatRepository motorcycleCatRepository;

    @Override
    public Boolean addCategory(MotorcycleCatEntity motorcycleCatEntity) {

        boolean exist = motorcycleCatRepository.existsCategoriesByName(motorcycleCatEntity.getName());
        if (exist) {
            System.out.println("Da ton tai");
            return false;
        } else {
            motorcycleCatRepository.save(motorcycleCatEntity);
            return true;
        }


    }

    @Override
    public String removeCategoryById(Long id) {
        motorcycleCatRepository.findById(id);
        if (motorcycleCatRepository.findById(id).isPresent()){
            motorcycleCatRepository.deleteById(id);
            return ("xoa thanh cong");
        }
        else {
            return ("xoa that bai");
        }
    }

    @Override
    public List<MotorcycleCatEntity> getAllCategory() {
        return motorcycleCatRepository.findAll();
    }

    @Override
    public MotorcycleCatEntity findById(Long category_id) {
        return motorcycleCatRepository.findById(category_id).get();
    }

    @Override
    public void updateCategory(MotorcycleCatEntity motorcycleCatEntity) {
        motorcycleCatRepository.save(motorcycleCatEntity);
    }


}
