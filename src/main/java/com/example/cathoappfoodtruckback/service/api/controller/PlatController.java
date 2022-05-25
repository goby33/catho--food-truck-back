package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.ResponsePlatDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class PlatController implements PlatApi {

    @Autowired
    PlatService platService;

    @Override
    public ResponseEntity<ResponsePlatDTO> getPlats()  {
        ResponsePlatDTO platDTOS = platService.getPlats();
        return new ResponseEntity(platDTOS, HttpStatus.ACCEPTED);
    }
}
