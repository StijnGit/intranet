package be.stijn.intranet.maps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.joda.time.DateTime;

@Entity
@Table(name = "heating")
public class Heating {
	
	@Id @GeneratedValue private long id;
	private String zone;
	private DateTime starttime;
	private DateTime stopdate;
	private int day;
	
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
	
	public DateTime getStopdate(){
		return stopdate;
	}
	
	public void setStopdate(DateTime stopdate){
		this.stopdate = stopdate;
	}
	
	public int getDay(){
		return day;
	}
	
	public void getDay(int day){
		this.day = day;
	}


}
