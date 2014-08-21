package be.stijn.intranet.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.stijn.intranet.maps.Input;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class InputDao {
	@Autowired private SessionFactory sessionFactory;
	
	@Transactional
	public List<Input> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List inputs = session.createQuery("from Input").list();
		return inputs;
	}
}
