package com.guney.shopapi.service;

import com.guney.shopapi.entity.Smartphone;

import java.util.List;

public interface SmartphoneService {

    // get all phones
    List<Smartphone> getAll();

    // get a phone by id
    Smartphone getById(int theId);

    // save new phone
    Smartphone save(Smartphone theProduct);

    // delete by id
    String delete(int theId);
}
