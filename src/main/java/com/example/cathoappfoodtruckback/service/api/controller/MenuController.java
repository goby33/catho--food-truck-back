package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.MenuDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MenuController implements MenuApi{

    @Override
    public ResponseEntity<List<MenuDTO>> getMenus() throws FunctionalException {
        return new ResponseEntity(null, HttpStatus.ACCEPTED);
    }
}