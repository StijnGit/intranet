package be.stijn.intranet.command;

import java.util.ArrayList;
import java.util.List;

import be.stijn.intranet.maps.Input;
import be.stijn.intranet.maps.Output;

public class PlcDataCommand {
	
	private List<Output> plcOutputData = new ArrayList<Output>();
	private List<Input> plcInputData = new ArrayList<Input>();
	
	public void addPlcOutputData(Output value) {
		plcOutputData.add(value);
	}
	
	public List<Output> getPlcOutputData() {
		return plcOutputData;
	}

	public void setPlcOutputData(List<Output> plcOutputData) {
		this.plcOutputData = plcOutputData;
	}
	
	public void addPlcInputData(Input value) {
		plcInputData.add(value);
	}
	
	public List<Input> getplcInputData() {
		return plcInputData;
	}
	
	public void setPlcInputData(List<Input> plcInputData) {
		this.plcInputData = plcInputData;
	}

}
