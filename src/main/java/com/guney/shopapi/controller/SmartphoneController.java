package com.guney.shopapi.controller;

import com.guney.shopapi.entity.Smartphone;
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
public class SmartphoneController {

    private Logger logger = LoggerFactory.getLogger(SmartphoneController.class);

    private SmartphoneService smartphoneService;

    @Autowired
    public SmartphoneController (SmartphoneService smartphoneService) {
        this.smartphoneService = smartphoneService;
    }

    @GetMapping("/smartphones")
    public List<Smartphone> getAll() {
        return smartphoneService.getAll();
    }

    @GetMapping("/smartphones/{theId}")
    public Smartphone getById(@PathVariable int theId) {
        return smartphoneService.getById(theId);
    }

    @PostMapping("/smartphones")
    public ResponseEntity<Smartphone> addSmartphone(@RequestBody Smartphone theProduct) {
        logger.info("POST");
        theProduct.setId(0);
        return new ResponseEntity<Smartphone>(smartphoneService.save(theProduct), HttpStatus.CREATED);
    }

    @PutMapping("/smartphones")
    public ResponseEntity<Smartphone> updateSmartphone(Smartphone theProduct) {
        return new ResponseEntity<Smartphone>(smartphoneService.save(theProduct), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/smartphones")
    public ResponseEntity<String> deleteSmartphone(@PathVariable int theId) {
        return new ResponseEntity<String>(smartphoneService.delete(theId), HttpStatus.OK);
    }

}
