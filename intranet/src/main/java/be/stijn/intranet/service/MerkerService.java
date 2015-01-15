package be.stijn.intranet.service;

import java.util.List;

import be.stijn.intranet.model.Merker;

public interface MerkerService {
	List<Merker> findAll();
	Merker getMerker(int nr);
	List<Merker> getFilledPlcDataCommand();
	void setMerker(int nr, boolean value );
	
}
