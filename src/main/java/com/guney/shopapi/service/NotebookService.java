package com.guney.shopapi.service;

import com.guney.shopapi.entity.Notebook;

import java.util.List;

public interface NotebookService {

    // get all notebooks
    List<Notebook> getAll();

    // get a notebook by id
    Notebook getById(int theId);

    // save new notebook
    Notebook save(Notebook theProduct);

    // delete by id
    String delete(int theId);
}
