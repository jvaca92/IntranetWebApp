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
public class PersonDAOImpl implements PersonDAO {

	
@Autowired
private SessionFactory sessionFactory;

@Override
@SuppressWarnings("unchecked")
public List<Person> findAll() {
	
	Query query = sessionFactory.getCurrentSession().createQuery("from Person");

	
	return query.list();
}


}
