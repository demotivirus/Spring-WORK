package demotivirus.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import demotivirus.models.User;
import demotivirus.services.UserManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	UserManager manager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/check-user")
	public ModelAndView checkUser(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("secondPage");

		modelAndView.addObject("user", user);

		return modelAndView;
	}

//	@RequestMapping(value = "/get-all-users", method = RequestMethod.POST)
//	public String getAllEmployees(Model model)	{
//		model.addAttribute("user", manager.getAllUsers());
//		return "allUsersDisplay";
//	}
}

