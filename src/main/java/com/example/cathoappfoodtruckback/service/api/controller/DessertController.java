package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.ResponseDessertDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.DessertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class DessertController implements DessertApi{

    @Autowired
    DessertService dessertService;
    @Override
    public ResponseEntity<ResponseDessertDTO> getDesserts()  {
        ResponseDessertDTO responseDessertDTO = dessertService.getDesserts();
        return new ResponseEntity(responseDessertDTO, HttpStatus.ACCEPTED);
    }
}
