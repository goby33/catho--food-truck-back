package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.DessertDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.DessertService;
import com.example.cathoappfoodtruckback.service.client.repository.DessertRepository;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DessertController implements DessertApi{

    @Autowired
    DessertService dessertService;
    @Override
    public ResponseEntity<List<DessertDTO>> getDesserts() throws FunctionalException {
        List<DessertDTO> dessertDTOS = dessertService.getDesserts();
        return new ResponseEntity(dessertDTOS, HttpStatus.ACCEPTED);
    }
}
