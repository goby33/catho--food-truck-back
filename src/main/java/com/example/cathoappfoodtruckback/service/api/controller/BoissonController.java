package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.ResponseBoissonDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.BoissonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class BoissonController implements BoissonApi{

    @Autowired
    BoissonService boissonService;
    @Override
    public ResponseEntity<ResponseBoissonDTO> getBoissons()  {
        ResponseBoissonDTO boissonDTOS = boissonService.getBoisson();
        return new ResponseEntity(boissonDTOS, HttpStatus.ACCEPTED);
    }
}
