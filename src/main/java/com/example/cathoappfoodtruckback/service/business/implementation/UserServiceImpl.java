package com.example.cathoappfoodtruckback.service.business.implementation;

import com.example.cathoappfoodtruckback.service.api.model.UserDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.UserService;
import com.example.cathoappfoodtruckback.service.client.entity.User;
import com.example.cathoappfoodtruckback.service.client.repository.UserRepository;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    public UserDTO getUser(String name, String mdp) throws FunctionalException {
        Optional<User> userOptional = userRepository.findByPseudoAAndAndMdp(name, mdp);
        if (userOptional.isEmpty()) {
            throw  new FunctionalException("mot de passe ou UserName incorrect");
        }
        return this.toEntity(userOptional.get());
    }

    public  UserDTO toEntity(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setIdUser(user.getId());
        userDTO.setNom(user.getNom());
        userDTO.setPrenom(user.getPrenom());
        userDTO.setFormation(user.getFormation());
        userDTO.setUrlImage(user.getUrlImage());
        userDTO.setPseudo(user.getPseudo());
        userDTO.setSolde(user.getSolde());
        return userDTO;
    }
}

