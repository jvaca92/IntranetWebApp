package intranetwebapp.controllers;


import intranetwebapp.service.LoginService;
import intranetwebapp.service.PersonService;
import intranetwebapp.model.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.log.LogUtils;

@Controller
//@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginServiceImpl;
	
	
	@RequestMapping(value="/login", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView validUser(@ModelAttribute("person") PersonModel personModel) {
 
		 ModelAndView model= new ModelAndView("login");
		         try
		        {
		            boolean validUser = loginServiceImpl.isValidUser(personModel.getName(), personModel.getPassword());
		 	            
		            //Zjistí zda-li je user přihlášen
		            if(validUser)
		 	            {
		                 System.out.println("User Login Successful");

			             model.addObject("successMessage", personModel.getName());
			            }
		            else
		 	            {
		            	 System.out.println("Login wasn't Successful"); 
		 	             model.setViewName("errormessage");
		            	 model.addObject("unsuccessmessage", "Invalid credentials!!");
		 	             
		 	            }
		 	 
		         }
		       catch(Exception e)
		 	        {
		 	            e.printStackTrace();
			        }
			 
			        return model;
	}

}
