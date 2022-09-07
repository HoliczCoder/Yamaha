package com.yamaha.service;

import com.yamaha.model.MotorcycleCat;
import com.yamaha.repository.MotorcycleCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleCatServiceImpl implements MotorcycleCatService {
    @Autowired
    MotorcycleCatRepository motorcycleCatRepository;

    @Override
    public Boolean addCategory(MotorcycleCat motorcycleCat) {

        boolean exist = motorcycleCatRepository.existsCategoriesByName(motorcycleCat.getName());
        if (exist) {
            System.out.println("Da ton tai");
            return false;
        } else {
            motorcycleCatRepository.save(motorcycleCat);
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
    public List<MotorcycleCat> getAllCategory() {
        return motorcycleCatRepository.findAll();
    }


}
