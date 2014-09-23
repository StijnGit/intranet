package be.stijn.intranet.command;

import java.util.ArrayList;
import java.util.List;

public class PlcDataCommand {
	
	private List<Boolean> plcOutputData = new ArrayList<Boolean>();
	
	public void addPlcOutputData(Boolean value) {
		plcOutputData.add(value);
	}
	
	public List<Boolean> getPlcOutputData() {
		return plcOutputData;
	}

	public void setPlcOutputData(List<Boolean> plcOutputData) {
		this.plcOutputData = plcOutputData;
	}

}
