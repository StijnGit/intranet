package be.stijn.intranet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.stijn.intranet.maps.Output;

@Repository
public class OutputDaoImpl implements OutputDao {

	@Autowired private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings({ "unchecked"})
	
	public List<Output> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Output").list();
	}

}
