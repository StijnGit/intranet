package be.stijn.intranet.dao;

import java.util.List;

import be.stijn.intranet.model.Input;

public interface InputDao {

	List<Input> findAll();
	Input findByNr(int nr);
}
