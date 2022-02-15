package com.example.cathoappfoodtruckback.service.business.contrat;

import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;

public interface UsersService {
    UserDTO getUser(String pseudo, String mdp) throws FunctionalException;
}
