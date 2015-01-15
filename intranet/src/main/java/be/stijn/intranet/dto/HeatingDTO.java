package be.stijn.intranet.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import be.stijn.intranet.model.Heating;

public class HeatingDTO implements Serializable{


	private static final long serialVersionUID = 34768735428027767L;

	@Id @GeneratedValue private long id;
	private String zone;
	private Date starttime;
	private Date stoptime;
	private Boolean ma;
	private Boolean di;
	private Boolean woe;
	private Boolean don;
	private Boolean vrij;
	private Boolean za;
	private Boolean zo;
	
	public HeatingDTO(Heating heating){
		setId(heating.getId());
		setMa(heating.getMa());
		setDi(heating.getDi());
		setWoe(heating.getWoe());
		setDon(heating.getDon());
		setVrij(heating.getVrij());
		setZa(heating.getZa());
		setZo(heating.getZo());
		
		setStarttime(new Date(heating.getStarttime().getMillis()));
		setStoptime(new Date(heating.getStoptime().getMillis()));
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getStoptime() {
		return stoptime;
	}

	public void setStoptime(Date stoptime) {
		this.stoptime = stoptime;
	}

	public Boolean getMa() {
		return ma;
	}

	public void setMa(Boolean ma) {
		this.ma = ma;
	}

	public Boolean getDi() {
		return di;
	}

	public void setDi(Boolean di) {
		this.di = di;
	}

	public Boolean getWoe() {
		return woe;
	}

	public void setWoe(Boolean woe) {
		this.woe = woe;
	}

	public Boolean getDon() {
		return don;
	}

	public void setDon(Boolean don) {
		this.don = don;
	}

	public Boolean getVrij() {
		return vrij;
	}

	public void setVrij(Boolean vrij) {
		this.vrij = vrij;
	}

	public Boolean getZa() {
		return za;
	}

	public void setZa(Boolean za) {
		this.za = za;
	}

	public Boolean getZo() {
		return zo;
	}

	public void setZo(Boolean zo) {
		this.zo = zo;
	}

	
	
}
