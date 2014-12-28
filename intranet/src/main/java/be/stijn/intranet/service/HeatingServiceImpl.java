package be.stijn.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.stijn.intranet.dao.HeatingDao;
import be.stijn.intranet.dao.MerkerDaoImpl;
import be.stijn.intranet.manager.DeviceManager;
import be.stijn.intranet.maps.Heating;

@Service
public class HeatingServiceImpl implements HeatingService {

	@Autowired
	private HeatingDao heatingDao;
	@Autowired
	private MerkerDaoImpl merkerDaoImpl;
	@Autowired
	private DeviceManager deviceManager;
	
	@Override
	@Transactional
	public List<Heating> findByZone(String zone) {
		return heatingDao.findByZone(zone);
	}

	@Override
	@Transactional
	public void addHeating(Heating heating) {
		heatingDao.addHeating(heating);	
	}

	@Override
	@Transactional
	public void editHeating(Heating heating) {
		heatingDao.editHeating(heating);
		
	}

	@Override
	@Transactional
	public void deleteHeating(Heating heating) {
		heatingDao.deleteHeating(heating);
		
	}
}