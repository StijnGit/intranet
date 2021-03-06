package be.stijn.intranet.dao;

import java.util.List;

import be.stijn.intranet.model.Heating;


public interface HeatingDao {
	
	List<Heating> findByZone(String zone);
	List<Heating> findByDay(String day);
	List<Heating> findAll();
	void addHeating(Heating h);
	void editHeating(Heating heating);
	void deleteHeating(Heating heating);

}
