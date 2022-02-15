package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.PlatDTO;
import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public class UsersController implements UsersApi{

    @Override
    public ResponseEntity<UserDTO> getuser(String pseudo, String mdt) throws FunctionalException {
        return new ResponseEntity(null, HttpStatus.ACCEPTED);
    }
}
