package be.stijn.intranet.command;

import java.util.ArrayList;
import java.util.List;

import be.stijn.intranet.maps.Heating;
import be.stijn.intranet.maps.Input;
import be.stijn.intranet.maps.Merker;
import be.stijn.intranet.maps.Output;

public class PlcDataCommand {
	
	private List<Output> plcOutputData = new ArrayList<Output>();
	private List<Input> plcInputData = new ArrayList<Input>();
	private List<Merker> plcMerkerData = new ArrayList<Merker>();
	private List<Heating> heatingData = new ArrayList<Heating>();
	
	
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
	
	public void addPlcMerkerData(Merker value) {
		plcMerkerData.add(value);
	}
	
	public List<Merker> getPlcMerkerData() {
		return plcMerkerData;
	}
	
	public void setPlcMerkerData(List<Merker> plcMerkerData){
		this.plcMerkerData = plcMerkerData;
	}
	
	public void addHeatingData(Heating value) {
		heatingData.add(value);
	}
	
	public List<Heating> getHeatingData(){
		return heatingData;
	}
	
	public void setHeatingData(List<Heating> heatingData) {
		this.heatingData = heatingData;
	}
}
