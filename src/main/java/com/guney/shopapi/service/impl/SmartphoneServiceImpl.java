package com.guney.shopapi.service.impl;

import com.guney.shopapi.dao.repository.SmartphoneRepository;
import com.guney.shopapi.entity.Smartphone;
import com.guney.shopapi.exception.ProductException;
import com.guney.shopapi.service.SmartphoneService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    private SmartphoneRepository smartphoneRepository;

    public SmartphoneServiceImpl(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public List<Smartphone> getAll() {
        List<Smartphone> smartphones = smartphoneRepository.findAll();
        if(smartphones == null) {
            throw new ProductException("There is no product yet.");
        } else {
            return smartphones;
        }
    }

    @Override
    public Smartphone getById(int theId) {
        Optional<Smartphone> theSmartphone = smartphoneRepository.findById(theId);
        if(!theSmartphone.isPresent()) {
            throw new ProductException("This product does not exist with this Id: " + theId);
        } else {
            return theSmartphone.get();
        }
    }

    @Override
    public Smartphone save(Smartphone theSmartphone) {
        return smartphoneRepository.save(theSmartphone);
    }

    @Override
    public String delete(int theId) {
        Optional<Smartphone> theSmartphone = smartphoneRepository.findById(theId);
        if(!theSmartphone.isPresent()) {
            throw new ProductException("There is no product with this Id: " + theId);
        } else {
            smartphoneRepository.deleteById(theId);
            return "Successfully deleted. Id: " + theId;
        }
    }
}
