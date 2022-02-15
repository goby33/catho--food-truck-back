package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.PlatDTO;
import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.UserService;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.Optional;

public class UsersController implements UsersApi{
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<UserDTO> getuser(String pseudo, String mdt) throws FunctionalException {
        UserDTO userDTO = userService.getUser(pseudo, mdt);
        return new ResponseEntity(userDTO, HttpStatus.ACCEPTED);
    }
}
