package com.guney.shopapi.service.impl;

import com.guney.shopapi.dao.repository.NotebookRepository;
import com.guney.shopapi.dao.repository.SmartphoneRepository;
import com.guney.shopapi.entity.Notebook;
import com.guney.shopapi.entity.Smartphone;
import com.guney.shopapi.exception.ProductException;
import com.guney.shopapi.service.NotebookService;
import com.guney.shopapi.service.SmartphoneService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotebookServiceImpl implements NotebookService {

    private NotebookRepository notebookRepository;

    public NotebookServiceImpl(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    @Override
    public List<Notebook> getAll() {
        List<Notebook> notebooks = notebookRepository.findAll();
        if(notebooks == null) {
            throw new ProductException("There is no product yet.");
        } else {
            return notebooks;
        }
    }

    @Override
    public Notebook getById(int theId) {
        Optional<Notebook> theNotebook = notebookRepository.findById(theId);
        if(!theNotebook.isPresent()) {
            throw new ProductException("This product does not exist with this Id: " + theId);
        } else {
            return theNotebook.get();
        }
    }

    @Override
    public Notebook save(Notebook theSmartphone) {
        return notebookRepository.save(theSmartphone);
    }

    @Override
    public String delete(int theId) {
        Optional<Notebook> theSmartphone = notebookRepository.findById(theId);
        if(!theSmartphone.isPresent()) {
            throw new ProductException("There is no product with this Id: " + theId);
        } else {
            notebookRepository.deleteById(theId);
            return "Successfully deleted. Id: " + theId;
        }
    }
}
