package toys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import toys.entity.User;
import toys.service.UserService;

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
        model.addAttribute("users",userService.findAll());
        model.addAttribute("user",new User());
        return "signup";
    }
    @PostMapping(value = "/signup")
    public String save (@ModelAttribute User user){
        userService.save(user);
        return "redirect:/signup";
    }

   /* @PostMapping(value = "/saveuser")
    public String saveUser(@RequestParam User user)
    {
        User user =new User();
        user.setName(username);
        user.setEmail(usermail);
        user.setPssword(userpassword);
        user.setShippindAddress(usershipadres);

        userService.save(user);

    return "redirect:/signup";}*/

    @GetMapping(value = "updateUser/{id}")
    String update(@PathVariable int id,Model model){
        User user=userService.findOne(id);
        model.addAttribute("currentUser",user);
        return "/updateUser";
    }

    @PostMapping(value ="updateUser/{id}")
    String update(@PathVariable int id,
                  @RequestParam String username,
                  @RequestParam String usermail,
                  @RequestParam String userpassword,
                  @RequestParam String usershipadres)
    {
     User user=userService.findOne(id);
        user.setName(username);
        user.setEmail(usermail);
        user.setPssword(userpassword);
        user.setShippindAddress(usershipadres);

        userService.save(user);

        return "redirect:/signup";
    }

    @GetMapping(value ="/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        userService.delete(id);
        return "redirect:/signup";
    }
@GetMapping(value = "/signup/home")
   public String home(){
        return homeController.home();
    }
}

