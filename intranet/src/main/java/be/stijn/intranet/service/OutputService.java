package be.stijn.intranet.service;

import java.util.List;

import be.stijn.intranet.maps.Output;

public interface OutputService {
	List<Output> findAll();
	Output getOutput(int nr);
	List<Output> getFilledPlcDataCommand();
}
