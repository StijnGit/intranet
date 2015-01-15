package be.stijn.intranet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.stijn.intranet.model.Input;

@Repository
public class InputDaoImpl implements InputDao{

	@Autowired private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings({ "unchecked"})
	public List<Input> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Input").list();
	}

	@Override
	@SuppressWarnings({ "unchecked"})
	public Input findByNr(int nr) {
		List<Input> inputs = sessionFactory.getCurrentSession()
				.createQuery("from Input where nr = :nr")
				.setParameter("nr",nr)
				.list();
		if(inputs.size() > 1){
			throw new IllegalArgumentException();
		}else if(inputs.size() == 0){
			return null;
		}
		return inputs.get(0);
	}
	
	

}
