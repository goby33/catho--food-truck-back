package com.example.cathoappfoodtruckback.service.business.implementation;

import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.UsersService;
import com.example.cathoappfoodtruckback.service.client.entity.User;
import com.example.cathoappfoodtruckback.service.client.repository.UserRepository;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UserRepository userRepository;

    public UserDTO getUser(String pseudo, String mdp) throws FunctionalException {
        Optional<User> userOptional = userRepository.findAllByPseudoAndMdp(pseudo, mdp);
        if (userOptional.isEmpty()) {
            throw new FunctionalException("sk,nvosfnbv");
        }
        return new UserDTO();
    }
}
