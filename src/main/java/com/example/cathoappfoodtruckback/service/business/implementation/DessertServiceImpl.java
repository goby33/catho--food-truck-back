package com.example.cathoappfoodtruckback.service.business.implementation;

import com.example.cathoappfoodtruckback.service.api.model.DessertDTO;
import com.example.cathoappfoodtruckback.service.api.model.ResponseDessertDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.DessertService;
import com.example.cathoappfoodtruckback.service.client.entity.Dessert;
import com.example.cathoappfoodtruckback.service.client.repository.DessertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DessertServiceImpl implements DessertService {
    @Autowired
    DessertRepository dessertRepository;

    public ResponseDessertDTO getDesserts() {
        ResponseDessertDTO responseDessertDTO = new ResponseDessertDTO();
        List<DessertDTO> dessertDTOS = this.toDTOdesserts(dessertRepository.findAll());
        responseDessertDTO.setData(dessertDTOS);
        return responseDessertDTO;

    }


    public List<DessertDTO> toDTOdesserts (List<Dessert> desserts) {
        List<DessertDTO> dessertDTOS = new ArrayList<>();
        for (Dessert dessert: desserts){
            DessertDTO dessertDTO = new DessertDTO();
            dessertDTO.setId(dessert.getId());
            dessertDTO.setNom(dessert.getNom());
            dessertDTO.setDescription(dessert.getDescription());
            dessertDTO.setNote(dessert.getNote());
            dessertDTO.setPrix(dessert.getPrix());
            dessertDTO.setUrlImage(dessert.getUrlImage());
            dessertDTOS.add(dessertDTO);
        }
        return dessertDTOS;
    }
}
