package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.BoissonDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.BoissonService;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BoissonController implements BoissonApi{

    @Autowired
    BoissonService boissonService;
    @Override
    public ResponseEntity<List<BoissonDTO>> getBoissons() throws FunctionalException {
        List<BoissonDTO> boissonDTOS = boissonService.getBoisson();
        return new ResponseEntity(boissonDTOS, HttpStatus.ACCEPTED);
    }
}
