package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.PlatDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PlatController implements PlatApi {

    public ResponseEntity<List<PlatDTO>> getPlats() throws FunctionalException {
        return new ResponseEntity(null, HttpStatus.ACCEPTED);
    }
}
