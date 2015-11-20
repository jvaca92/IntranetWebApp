package intranetwebapp.service;

import intranetwebapp.DAO.LoginDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import intranetwebapp.entity.Person;




@Service
public class LoginServiceImpl  implements LoginService{

	
	
	@Autowired
	LoginDAO loginDAOImpl;

	@Override
	@SuppressWarnings("unchecked")
	public boolean isValidUser(String name, String password) {
	
	boolean validUser = false; 
		
    List listValidUser = loginDAOImpl.findValidUser(name, password);
	
    //Podmínka, která ověří správnost usera
    if(!(listValidUser.isEmpty())) 
    {
    	System.out.println("User was found ");
    	validUser = true;
    } else {
    	System.out.println("User was not found");
    	
    }
   
    
		return validUser;
	}
	
	
}
