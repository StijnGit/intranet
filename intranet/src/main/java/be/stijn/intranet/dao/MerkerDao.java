package be.stijn.intranet.dao;

import java.util.List;

import be.stijn.intranet.model.Merker;

public interface MerkerDao {
	List<Merker> findAll();
	Merker getByNr(int nr);
}
