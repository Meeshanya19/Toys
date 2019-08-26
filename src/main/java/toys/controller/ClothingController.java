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
    public void InitBinder(WebDataBinder binder){
        binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
    }

    @GetMapping(value = "/clothing" )
   public String clothing(Model model){
        model.addAttribute("clothin",clothingService.findAll());
        List<Size>sizeList=new ArrayList<Size>(Arrays.asList(Size.values()));
        model.addAttribute("size", sizeList);
        List<Sex>sesxList=new ArrayList<Sex>(Arrays.asList(Sex.values()));
        model.addAttribute("sex",sesxList);
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("clothing", new Clothing());
        return "clothing";
    }

   /* @PostMapping(value = "/saveclothing" )
    public String save(Model model,
            @RequestParam String brand,
            @RequestParam String description,
            @RequestParam String name,
            @RequestParam String price,
            @RequestParam Country country,
            @RequestParam String age,
                       @RequestParam Size sizeValue,
                       @RequestParam Sex sexValue
    )
    {


        Clothing clothing=new Clothing();

        clothing.setBrand(brand);
        clothing.setDescription(description);
        clothing.setName(name);
        clothing.setPrice(Integer.parseInt(price));
        clothing.setCountry(country);
        clothing.setAge(Integer.parseInt(age));
        clothing.setSize(sizeValue);
        clothing.setSex(sexValue);

        clothingService.save(clothing);

        return "redirect:/clothing";
    }*/

    @PostMapping(value = "clothing")
    public String save(Clothing clothing){
        clothingService.save(clothing);

        return "redirect:/clothing";
    }

    @GetMapping(value ="/updateClothing/{id}")
            String update(@PathVariable int id,Model model){
       Clothing clothing= clothingService.findOne(id);

        model.addAttribute("currentClothing",clothing);
        model.addAttribute("countries" ,countryService.findAll());
        return "/updateClothing";
    }
    @PostMapping(value ="/updateClothing/{id}")
    public String update(@PathVariable int id,
                         @RequestParam String brand,
                         @RequestParam String description,
                         @RequestParam String name,
                         @RequestParam String price,
                         @RequestParam Country country,
                         @RequestParam String age,
                       @RequestParam Size sizeValue,
                        @RequestParam Sex sexValue
     )
    {
       Clothing clothing= clothingService.findOne(id);

        clothing.setBrand(brand);
        clothing.setDescription(description);
        clothing.setName(name);
        clothing.setPrice(Integer.parseInt(price));
        clothing.setCountry(country);
        clothing.setAge(Integer.parseInt(age));
        clothing.setSize(sizeValue);
        clothing.setSex(sexValue);

        clothingService.save(clothing);
        return "redirect:/clothing";
    }

    @RequestMapping(value = "/deleteClothing/{id}",method = RequestMethod.GET)
    public String deleteClothing(@PathVariable int id){
        clothingService.delete(id);
        return "redirect:/clothing";
    }
}
