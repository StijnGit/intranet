package be.stijn.intranet.dao;

import java.util.List;

import be.stijn.intranet.maps.Merker;

public interface MerkerDao {
	List<Merker> findAll();
	Merker getByNr(int nr);
}
