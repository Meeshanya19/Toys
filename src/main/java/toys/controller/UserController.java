package toys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import toys.entity.User;
import toys.service.UserService;
import toys.validator.userValidator.UserValidatorMessages;

/**
 * Created by Michail on 7/30/2019.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    HomeController homeController;

    @GetMapping(value = "/signup")
    public String signup(Model model){
        model.addAttribute("user",new User());
        return "user/signup";
    }




    @PostMapping(value ="/user/signup")
    public String saveUser(User user,Model model ){
        try {
            userService.save(user);
        } catch (Exception e) {
            if (e.getMessage().equals(UserValidatorMessages.USER_NAME_EMPTY) || e.getMessage().equals(UserValidatorMessages.USER_NAME_ALREADY_EXIST)) {
                model.addAttribute("userNameException", e.getMessage());
                return "/user/signup";
            }
        }
      //  model.addAttribute("user",user);

        return "home";
    }

    @GetMapping(value = "/admin/signup")
    public String AdminSignup(Model model){
        model.addAttribute("users",userService.findAll());
        model.addAttribute("user",new User());
        return "admin/signup";
    }
    @PostMapping(value = "/admin/signup")
    public String save (User user, Model model){
        try {
            userService.save(user);
        } catch (Exception e) {
           if(e.getMessage().equals(UserValidatorMessages.USER_NAME_EMPTY)||e.getMessage().equals(UserValidatorMessages.USER_NAME_ALREADY_EXIST))
           {
               model.addAttribute("userNameException",e.getMessage());
               return "/admin/signup";
           }
        }
        return "redirect:/admin/signup";
    }



    @GetMapping(value = "/updateUser/{id}")
    String update(@PathVariable int id,Model model){
        User user=userService.findOne(id);
        model.addAttribute("currentUser",user);
        return "update/user";
    }

    @PostMapping(value ="/updateUser/{id}")
    String update(User user,Model model){
    try {
        userService.save(user);
    } catch (Exception e) {
        if(e.getMessage().equals(UserValidatorMessages.USER_NAME_EMPTY)||e.getMessage().equals(UserValidatorMessages.USER_NAME_ALREADY_EXIST))
        {
            model.addAttribute("userNameException",e.getMessage());
            return "redirect:/updateUser/{id}";
        }
    }

        return "redirect:/admin/signup";
    }

    @GetMapping(value ="/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        userService.delete(id);
        return "redirect:/admin/signup";
    }
@GetMapping(value = "/signup/home")
   public String home(){
        return homeController.home();
    }
}

