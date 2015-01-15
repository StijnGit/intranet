package be.stijn.intranet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.stijn.intranet.model.Merker;

@Repository
public class MerkerDaoImpl implements MerkerDao{
	
	@Autowired private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Merker> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Merker").list();
	}

	@Override
	public Merker getByNr(int nr) {
		@SuppressWarnings("unchecked")
		List<Merker> merkers = sessionFactory.getCurrentSession()
				.createQuery("from Merker where nr = :nr")
				.setParameter("nr",nr)
				.list();
		if(merkers.size() > 1){
			throw new IllegalArgumentException();
		}else if(merkers.size() == 0){
			return null;
		}
		return merkers.get(0);
	}

}
