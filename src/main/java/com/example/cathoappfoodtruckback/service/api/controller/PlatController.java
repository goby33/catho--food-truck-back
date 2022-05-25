package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.PlatDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.PlatService;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PlatController implements PlatApi {

    @Autowired
    PlatService platService;

    @Override
    public ResponseEntity<List<PlatDTO>> getPlats()  {
        List<PlatDTO> platDTOS = platService.getPlats();
        return new ResponseEntity(platDTOS, HttpStatus.ACCEPTED);
    }
}
