package com.example.cathoappfoodtruckback.service.business.implementation;

import com.example.cathoappfoodtruckback.service.api.model.MenuDTO;
import com.example.cathoappfoodtruckback.service.api.model.ResponseMenuDTO;
import com.example.cathoappfoodtruckback.service.business.contrat.MenuService;
import com.example.cathoappfoodtruckback.service.client.entity.Menu;
import com.example.cathoappfoodtruckback.service.client.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    public ResponseMenuDTO getMenus()
    {
        List<MenuDTO> menuDTOS = this.toDTOmenu(menuRepository.findAll());
        ResponseMenuDTO responseMenuDTO = new ResponseMenuDTO();
        responseMenuDTO.setData(menuDTOS);
        return responseMenuDTO;
    }



    public List<MenuDTO> toDTOmenu (List<Menu> menus) {
        List<MenuDTO> boissonList = new ArrayList<>();
        for (Menu menu: menus){
            MenuDTO menuDTO = new MenuDTO();
            menuDTO.setId(menu.getId());
            menuDTO.setNom(menu.getNom());
            menuDTO.setDescription(menu.getDescription());
            menuDTO.setNote(menu.getNote());
            menuDTO.setPrix(menu.getPrix());
            menuDTO.setUrlImage(menu.getUrlImage());
            boissonList.add(menuDTO);
        }
        return boissonList;
    }
}
