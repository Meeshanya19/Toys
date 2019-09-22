package toys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import toys.entity.Orders;
import toys.service.ClothingService;
import toys.service.OrdersService;
import toys.service.UserService;

/**
 * Created by Michail on 8/6/2019.
 */
@Controller
public class OrdersController {
    @Autowired
  private   OrdersService ordersService;

    @Autowired
    private HomeController homeController;

    @Autowired
    private UserService userService;

    @Autowired
    private ClothingService clothingService;

    @RequestMapping(value = "/admin/orders", method = RequestMethod.GET)
    public String signup(Model model,Model usreM,Model clothingM) {
        model.addAttribute("orders", ordersService.findAll());
        usreM.addAttribute("users", userService.findAll());
        clothingM.addAttribute("clothing", clothingService.findAll());
        return "admin/orders";
    }

    @RequestMapping(value = "/saveorder", method = RequestMethod.POST)
    public String saveOrder(
            @RequestParam int userId,
            @RequestParam String shippingAddress,
            @RequestParam String totalAmount,
            @RequestParam int clothingId)

    {
       ordersService.save(new Orders(shippingAddress,Integer.parseInt(totalAmount)), userId,clothingId);

        return "redirect:/orders";
    }

    @RequestMapping(value = "/deleteOrder/{id}", method = RequestMethod.GET)
    public String deleteOrder(@PathVariable int id) {
        ordersService.delete(id);
        return "redirect:/orders";
    }
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return homeController.home();
    }

    @GetMapping(value = "/orderDetails/{id}")
    String details(Model model,Model clothingModel, @PathVariable int id){
        model.addAttribute("order",ordersService.findOne(id));

        return "orderDetails";
    }
}