package com.guney.shopapi.controller;

import com.guney.shopapi.entity.Notebook;
import com.guney.shopapi.entity.Smartphone;
import com.guney.shopapi.service.NotebookService;
import com.guney.shopapi.service.SmartphoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotebookController {

    private Logger logger = LoggerFactory.getLogger(SmartphoneController.class);

    private NotebookService notebookService;

    @Autowired
    public NotebookController (NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @GetMapping("/notebooks")
    public List<Notebook> getAll() {
        return notebookService.getAll();
    }

    @GetMapping("/notebooks/{theId}")
    public Notebook getById(@PathVariable int theId) {
        return notebookService.getById(theId);
    }

    @PostMapping("/notebooks")
    public ResponseEntity<Notebook> addNotebook(@RequestBody Notebook theNotebook) {
        logger.info("POST");
        theNotebook.setId(0);
        return new ResponseEntity<Notebook>(notebookService.save(theNotebook), HttpStatus.CREATED);
    }

    @PutMapping("/notebooks")
    public ResponseEntity<Notebook> updateNotebook(Notebook theNotebook) {
        return new ResponseEntity<Notebook>(notebookService.save(theNotebook), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/notebooks")
    public ResponseEntity<String> deleteNotebook(@PathVariable int theId) {
        return new ResponseEntity<String>(notebookService.delete(theId), HttpStatus.OK);
    }

}
