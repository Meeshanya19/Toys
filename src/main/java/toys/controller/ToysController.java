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
import toys.entity.commodity.Furniture;
import toys.entity.commodity.Toys;
import toys.service.CountryService;
import toys.service.FurnitureService;
import toys.service.ToysService;

/**
 * Created by Michail on 9/1/2019.
 */
@Controller
public class ToysController {
    @Autowired
    ToysService  toysService;

    @Autowired
    CountryService countryService;

    @InitBinder
    public void InitBinder(WebDataBinder binder){
        binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
    }

    @GetMapping(value = "/admin/toys" )
    public String toys (Model model){
        model.addAttribute("allToys",toysService.findAll());
        model.addAttribute("newToys", new Toys());
        model.addAttribute("countries",countryService.findAll() );
        return "admin/toys";
    }

    @GetMapping(value = "/toys" )
    public String toysUser (Model model){
        model.addAttribute("allToys",toysService.findAll());
        return "user/toys";
    }
    @PostMapping(value = "/admin/toys")
    public   String save(Toys toys){
        toysService.save(toys);
        return "redirect:/admin/toys";
    }
    @GetMapping(value ="/deleteToys/{id}")
    public String deleteToys(@PathVariable int id){
        toysService.delete(id);
        return "redirect:/admin/toys";
    }

    @GetMapping(value ="/updateToys/{id}")
    public String updateToys(@PathVariable int id, Model model){
        model.addAttribute("toy", toysService.findOne(id));
        model.addAttribute("countries",countryService.findAll() );
        return "update/updateToys";
    }

    @PostMapping(value ="/updateToys/{id}" )
    public String updateToys(Toys toys){
        toysService.save(toys);
        return "redirect:/admin/toys";
    }
}
