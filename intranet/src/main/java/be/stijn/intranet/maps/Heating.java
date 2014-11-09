package be.stijn.intranet.maps;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name = "heating")
public class Heating implements Serializable {
	
	private static final long serialVersionUID = -4559607600037189795L;
	
	@Id @GeneratedValue private long id;
	private String zone;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime starttime;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime stoptime;
	private Boolean ma;
	private Boolean di;
	private Boolean woe;
	private Boolean don;
	private Boolean vrij;
	private Boolean za;
	private Boolean zo;
	
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getZone(){
		return zone;
	}
	
	public void setZone(String zone){
		this.zone = zone;
	}
	
	public DateTime getStarttime(){
		return starttime;
	}
	
	public void setStarttime(DateTime starttime){
		this.starttime = starttime;
	}
	
	public DateTime getStoptime(){
		return stoptime;
	}
	
	public void setStopdate(DateTime stoptime){
		this.stoptime = stoptime;
	}
	
	public Boolean getMa(){
		return ma;
	}
	
	public void getMa(Boolean ma){
		this.ma = ma;
	}
	
	public Boolean getDi(){
		return di;
	}
	
	public void getDi(Boolean di){
		this.di = di;
	}
	
	public Boolean getWoe(){
		return woe;
	}
	
	public void getWoe(Boolean woe){
		this.woe = woe;
	}
	
	public Boolean getDon(){
		return don;
	}
	
	public void getDon(Boolean don){
		this.don = don;
	}
	
	public Boolean getVrij(){
		return vrij;
	}
	
	public void getVrij(Boolean vrij){
		this.vrij = vrij;
	}
	
	public Boolean getZa(){
		return za;
	}
	
	public void getZa(Boolean za){
		this.za = za;
	}
	
	public Boolean getZo(){
		return zo;
	}
	
	public void getZo(Boolean zo){
		this.zo = zo;
	}


}
