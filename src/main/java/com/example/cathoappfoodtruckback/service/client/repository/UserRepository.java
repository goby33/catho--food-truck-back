package com.example.cathoappfoodtruckback.service.client.repository;

import com.example.cathoappfoodtruckback.service.client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findAllByPseudoAndMdp(String nom, String mdp );
}
