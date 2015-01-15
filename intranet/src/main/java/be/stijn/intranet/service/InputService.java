package be.stijn.intranet.service;

import java.util.List;

import be.stijn.intranet.model.Input;

public interface InputService {
	List<Input> findAll();
	Input getInput(int nr);
	List<Input> getFilledPlcDataCommand();
}
