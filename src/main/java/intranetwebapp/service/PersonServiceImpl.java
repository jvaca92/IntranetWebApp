package intranetwebapp.service;

import intranetwebapp.DAO.PersonDAO;
import intranetwebapp.entity.Person;
import intranetwebapp.model.PersonModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.cfg.ExtendsQueueEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional 
public class PersonServiceImpl implements PersonService{

	
	@Autowired
	private PersonDAO personDAOImpl;
	
	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<PersonModel> findAll() {
		
	List personList = personDAOImpl.findAll();

		
    return personList;
	}


}
