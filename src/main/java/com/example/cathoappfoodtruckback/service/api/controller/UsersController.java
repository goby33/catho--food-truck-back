package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController implements UsersApi{

    @Override
    public ResponseEntity<UserDTO> getUser(String pseudo, String mdt) {
        return new ResponseEntity(null, HttpStatus.ACCEPTED);
    }
}
