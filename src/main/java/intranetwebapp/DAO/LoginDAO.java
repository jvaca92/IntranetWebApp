package intranetwebapp.DAO;

import java.util.List;

import intranetwebapp.entity.*;


public interface LoginDAO {
	

	public List<Person> findValidUser(String name, String password);

}
