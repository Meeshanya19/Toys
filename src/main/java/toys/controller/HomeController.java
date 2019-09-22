package toys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Michail on 7/30/2019.
 */
@Controller
public class HomeController {

    @RequestMapping(value ="/",method = RequestMethod.GET)
    public String home()
    {

        return "home";
    }
    @RequestMapping(value ="/admin",method = RequestMethod.GET)
    public String admin()
    {

        return "admin/admin";
    }
}
