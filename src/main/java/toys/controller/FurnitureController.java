package toys.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import toys.editors.CountryEditor;
import toys.entity.Country;
import toys.entity.Enum.Sex;
import toys.entity.Enum.Size;
import toys.entity.commodity.Clothing;
import toys.entity.commodity.Furniture;
import toys.service.CountryService;
import toys.service.FurnitureService;
import toys.serviceImpl.CountryServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import toys.service.FurnitureService;

/**
 * Created by Michail on 8/19/2019.
 */
@Controller
public class FurnitureController {
    @Autowired
    FurnitureService furnitureService;

    @Autowired
    CountryService countryService;

    @InitBinder
    public void InitBinder(WebDataBinder binder){
        binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
    }

    @GetMapping(value = "/furniture" )
    public String furniture(Model model){
        model.addAttribute("allFurniture",furnitureService.findAll());
        model.addAttribute("newFurniture", new Furniture());
        model.addAttribute("countries",countryService.findAll() );
        return "furniture";
    }
    @PostMapping(value = "/furniture")
    public   String save(Furniture furniture){
        furnitureService.save(furniture);

        return "redirect:/furniture";
    }
    @GetMapping(value ="/deleteFurniture/{id}")
    public String deleteFurniture(@PathVariable int id){
        furnitureService.delete(id);
        return "redirect:/furniture";
    }

    @GetMapping(value ="/updateFurniture/{id}")
    public String updateFurniture(@PathVariable int id, Model model){
        model.addAttribute("furniture",furnitureService.findOne(id));
        model.addAttribute("countries",countryService.findAll() );
        return "updateFurniture";
    }

    @PostMapping(value ="/updateFurniture/{id}" )
    public String updateFurniture(Furniture furniture){
        furnitureService.save(furniture);
        return "redirect:/furniture";
    }
}

