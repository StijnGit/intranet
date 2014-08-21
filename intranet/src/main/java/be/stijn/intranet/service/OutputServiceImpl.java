package be.stijn.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.stijn.intranet.dao.OutputDao;
import be.stijn.intranet.maps.Output;

@Service
public class OutputServiceImpl implements OutputService {

	@Autowired
	private OutputDao outputDao;
	
	@Transactional
	public List<Output> findAll() {
		return outputDao.findAll();
	
	}
	
	
}
