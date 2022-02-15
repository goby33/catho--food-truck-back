package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.UsersService;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController implements UsersApi{

    @Autowired
    UsersService usersService;
    @Override
    public ResponseEntity<UserDTO> getUser(String pseudo, String mdt) throws FunctionalException {
        UserDTO user = usersService.getUser(pseudo, mdt);
        return new ResponseEntity(user, HttpStatus.ACCEPTED);
    }
}
