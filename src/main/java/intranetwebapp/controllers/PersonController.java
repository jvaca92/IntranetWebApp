package intranetwebapp.controllers;

import intranetwebapp.service.PersonService;
import intranetwebapp.model.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class PersonController {

	@Autowired
	private PersonService personServiceImpl;
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView findAll() {
 
		List<PersonModel> message = personServiceImpl.findAll();
		
		return new ModelAndView("home", "listPerson", message);
	}
	
	
	
}
