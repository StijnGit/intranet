package be.stijn.intranet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.stijn.intranet.model.Output;

@Repository
public class OutputDaoImpl implements OutputDao {

	@Autowired private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings({ "unchecked"})
	public List<Output> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Output").list();
	}
	
	
	@Override
	@SuppressWarnings({ "unchecked"})
	public Output findByNr(int nr) {
		List<Output> outputs = sessionFactory.getCurrentSession()
				.createQuery("from Output where nr = :nr")
				.setParameter("nr",nr)
				.list();
		if(outputs.size() > 1){
			throw new IllegalArgumentException();
		}else if(outputs.size() == 0){
			return null;
		}
		return outputs.get(0);
	}

}
