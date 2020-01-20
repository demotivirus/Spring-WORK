package demotivirus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/access")
public class UserDisplayController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap){
        modelMap.addAttribute("message", "Spring 3 MVC");
        return "userDisplay";
    }
}
