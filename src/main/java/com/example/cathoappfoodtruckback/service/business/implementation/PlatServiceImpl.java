package com.example.cathoappfoodtruckback.service.business.implementation;

import com.example.cathoappfoodtruckback.service.api.model.BoissonDTO;
import com.example.cathoappfoodtruckback.service.api.model.PlatDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.PlatService;
import com.example.cathoappfoodtruckback.service.client.entity.Boisson;
import com.example.cathoappfoodtruckback.service.client.entity.Plat;
import com.example.cathoappfoodtruckback.service.client.repository.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlatServiceImpl implements PlatService {
    @Autowired
    PlatRepository platRepository;

    public List<PlatDTO> getPlats() {
        return this.toDTOplat(platRepository.findAll());
    }



    public List<PlatDTO> toDTOplat (List<Plat> plats) {
        List<PlatDTO> platDTOS = new ArrayList<>();
        for (Plat plat: plats){
            PlatDTO platDTO = new PlatDTO();
            platDTO.setIdBoisson(plat.getId());
            platDTO.setNom(plat.getNom());
            platDTO.setDescription(plat.getDescription());
            platDTO.setNote(plat.getNote());
            platDTO.setPrix(plat.getPrix());
            platDTO.setUrlImage(plat.getUrlImage());
            platDTOS.add(platDTO);
        }
        return platDTOS;
    }
}
