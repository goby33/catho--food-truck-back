package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.BoissonDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BoissonController implements BoissonApi{

    @Override
    public ResponseEntity<List<BoissonDTO>> getBoissons() throws FunctionalException {
        System.out.println("boisson");
        return new ResponseEntity(null, HttpStatus.ACCEPTED);
    }
}
