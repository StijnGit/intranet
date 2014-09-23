package be.stijn.intranet.dao;

import java.util.List;

import be.stijn.intranet.maps.Output;

public interface OutputDao {
	
	List<Output> findAll();
	Output findByNr(int nr);
}

