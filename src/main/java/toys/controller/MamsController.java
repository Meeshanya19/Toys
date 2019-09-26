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
import toys.entity.commodity.Mams;
import toys.service.CountryService;
import toys.service.FurnitureService;
import toys.service.MamsServise;

/**
 * Created by Michail on 9/1/2019.
 */
@Controller
public class MamsController {
    @Autowired
    MamsServise mamsServise;

    @Autowired
    CountryService countryService;

    @InitBinder
    public void InitBinder(WebDataBinder binder){
        binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
    }

    @GetMapping(value = "/admin/mams" )
    public String mams(Model model){
        model.addAttribute("allMams",mamsServise.findAll());
        model.addAttribute("newMams", new Mams());
        model.addAttribute("countries",countryService.findAll() );
        return "admin/mams";
    }


    @GetMapping(value = "/mams" )
    public String mamsUser(Model model){
        model.addAttribute("allMams",mamsServise.findAll());

        return "user/mams";
    }
    @PostMapping(value = "/admin/mams")
    public   String save(Mams mams){
        mamsServise.save(mams);
        return "redirect:/admin/mams";
    }
    @GetMapping(value ="/deleteMams/{id}")
    public String deleteMams(@PathVariable int id){
        mamsServise.delete(id);
        return "redirect:/admin/mams";
    }

    @GetMapping(value ="/updateMams/{id}")
    public String updateMams(@PathVariable int id, Model model){
        model.addAttribute("mams", mamsServise.findOne(id));
        model.addAttribute("countries",countryService.findAll() );
        return "update/mams";
    }

    @PostMapping(value ="/updateMams/{id}" )
    public String updateMams(Mams mams){
        mamsServise.save(mams);
        return "redirect:/admin/mams";
    }
}
