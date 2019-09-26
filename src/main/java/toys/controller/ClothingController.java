package toys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import toys.editors.CountryEditor;
import toys.entity.Country;
import toys.entity.Enum.Sex;
import toys.entity.Enum.Size;
import toys.entity.commodity.Clothing;
import toys.service.ClothingService;
import toys.service.CountryService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michail on 8/6/2019.
 */
@Controller
public class ClothingController {

    @Autowired
    ClothingService clothingService;
    @Autowired
    CountryService countryService;

    @InitBinder
    public void InitBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
    }

    @GetMapping(value = "/admin/clothing")
    public String clothing(Model model) {
        model.addAttribute("clothin", clothingService.findAll());
        List<Size> sizeList = new ArrayList<Size>(Arrays.asList(Size.values()));
        model.addAttribute("size", sizeList);
        List<Sex> sesxList = new ArrayList<Sex>(Arrays.asList(Sex.values()));
        model.addAttribute("sex", sesxList);
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("clothing", new Clothing());
        return "admin/clothing";
    }

    @GetMapping(value = "/clothing")
    public String clothingUser(Model model) {
        model.addAttribute("clothin", clothingService.findAll());
        List<Size> sizeList = new ArrayList<Size>(Arrays.asList(Size.values()));
        model.addAttribute("size", sizeList);
        List<Sex> sesxList = new ArrayList<Sex>(Arrays.asList(Sex.values()));
        model.addAttribute("sex", sesxList);
        model.addAttribute("countries", countryService.findAll());

        return "/user/clothing";
    }


    @PostMapping(value = "admin/clothing")
    public String save(Clothing clothing) {
        clothingService.save(clothing);

        return "redirect:/admin/clothing";
    }

    @GetMapping(value = "/updateClothing/{id}")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("currentClothing", clothingService.findOne(id));
        model.addAttribute("countries", countryService.findAll());
        return "update/clothing";
    }

    @PostMapping(value = "/updateClothing/{id}")
    public String updateClothing(Clothing clothing) {
        clothingService.save(clothing);
        return "redirect:/admin/clothing";
    }


    @GetMapping(value = "/deleteClothing/{id}")
    public String deleteClothing(@PathVariable int id) {
        clothingService.delete(id);
        return "redirect:/admin/clothing";
    }
}
