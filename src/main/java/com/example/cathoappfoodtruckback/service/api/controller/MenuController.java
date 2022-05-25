package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.ResponseMenuDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class MenuController implements MenuApi{

    @Autowired
    MenuService menuService;
    @Override
    public ResponseEntity<ResponseMenuDTO> getMenus()  {
        ResponseMenuDTO menuDTOS = menuService.getMenus();
        return new ResponseEntity(menuDTOS, HttpStatus.ACCEPTED);
    }
}
