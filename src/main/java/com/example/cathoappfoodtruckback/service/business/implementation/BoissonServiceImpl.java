package com.example.cathoappfoodtruckback.service.business.implementation;

import com.example.cathoappfoodtruckback.service.api.model.BoissonDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.BoissonService;
import com.example.cathoappfoodtruckback.service.client.entity.Boisson;
import com.example.cathoappfoodtruckback.service.client.repository.BoissonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoissonServiceImpl implements BoissonService {

    @Autowired
    BoissonRepository boissonRepository;

    public List<BoissonDTO> getBoisson() {
        return this.toDTOBoisson(boissonRepository.findAll());
    }


    public List<BoissonDTO> toDTOBoisson (List<Boisson> boissons) {
        List<BoissonDTO> boissonList = new ArrayList<>();
        for (Boisson boisson: boissons){
            BoissonDTO boissonDTO = new BoissonDTO();
            boissonDTO.setIdBoisson(boisson.getId());
            boissonDTO.setNom(boisson.getNom());
            boissonDTO.setDescription(boisson.getDescription());
            boissonDTO.setNote(boisson.getNote());
            boissonDTO.setPrix(boisson.getPrix());
            boissonDTO.setUrlImage(boisson.getUrlImage());
            boissonList.add(boissonDTO);
        }
        return boissonList;
    }
}
