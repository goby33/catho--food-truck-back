package com.example.cathoappfoodtruckback.service.business.contrat;

import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;

public interface UserService {
    public UserDTO getUser(String name, String mdp) throws FunctionalException;
}
