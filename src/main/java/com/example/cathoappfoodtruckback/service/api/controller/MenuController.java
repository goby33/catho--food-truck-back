package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.MenuDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.MenuService;
import com.example.cathoappfoodtruckback.service.client.repository.MenuRepository;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MenuController implements MenuApi{

    @Autowired
    MenuService menuService;
    @Override
    public ResponseEntity<List<MenuDTO>> getMenus() throws FunctionalException {
        List<MenuDTO> menuDTOS = menuService.getMenus();
        return new ResponseEntity(menuDTOS, HttpStatus.ACCEPTED);
    }
}
