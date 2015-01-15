package be.stijn.intranet.service;

import java.util.List;

import be.stijn.intranet.model.Heating;

public interface HeatingService {
	List<Heating> findByZone(String zone);
	void addHeating(Heating heating);
	void editHeating(Heating heating);
	void deleteHeating(Heating heating);
}
