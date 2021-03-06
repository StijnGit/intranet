package be.stijn.intranet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.stijn.intranet.model.Heating;

@Repository
public class HeatingDaoImpl implements HeatingDao{

	@Autowired 
	private SessionFactory sessionFactory;
	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Heating> findByZone(String zone) {
		List<Heating> heatings = sessionFactory.getCurrentSession()
				.createQuery("from Heating where zone = :zone")
				.setParameter("zone" ,zone)
				.list();
		if(heatings.size() == 0){
			return null;
		}
		else
		{
			return heatings;
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Heating> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Heating").list();
	}


	@Override
	public List<Heating> findByDay(String day) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void addHeating(Heating heating) {
		this.sessionFactory.getCurrentSession().persist(heating);	
	}


	@Override
	public void editHeating(Heating heating) {
		this.sessionFactory.getCurrentSession().merge(heating);
	}


	@Override
	public void deleteHeating(Heating heating) {
		this.sessionFactory.getCurrentSession().delete(heating);
	}
	

	
}
