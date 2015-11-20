package intranetwebapp.DAO;

import intranetwebapp.entity.Person;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;






@Repository 
@Transactional 
public class LoginDAOImpl implements LoginDAO {

	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Person> findValidUser(String name, String password) {

		Query query = sessionFactory.getCurrentSession().createQuery("from Person where name = :name and password = :password");
		
		query.setParameter("name", name);
		query.setParameter("password", password);
		
		
		//System.out.println(query.list().isEmpty());
		
		return query.list();
	}





	

	
	
	
}	
	
	
