package com.guney.shopapi.service;

import com.guney.shopapi.entity.Notebook;

import java.util.List;

public interface NotebookService {

    // get all phones
    List<Notebook> getAll();

    // get a phone by id
    Notebook getById(int theId);

    // save new phone
    Notebook save(Notebook theProduct);

    // delete by id
    String delete(int theId);
}
