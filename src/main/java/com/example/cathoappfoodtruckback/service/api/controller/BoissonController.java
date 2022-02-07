package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.BoissonDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class BoissonController implements BoissonApi{

    public ResponseEntity<List<BoissonDTO>> getBoissons() throws FunctionalException {
        return new ResponseEntity(null, HttpStatus.ACCEPTED);
    }
}
