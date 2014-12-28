package be.stijn.intranet.cron;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import PLCCom.eRegion;
import be.stijn.intranet.dao.HeatingDao;
import be.stijn.intranet.manager.DeviceManager;
import be.stijn.intranet.maps.Heating;

@Component
public class RunTask {
	@Autowired
	private HeatingDao heatingDao;
	@Autowired
	private DeviceManager deviceManager;

	@Scheduled(fixedDelay =  30 * 1000L)
	@Transactional
	public void ThermostaatTask(){

		DateTime dt = new DateTime();
		int day = dt.getDayOfWeek();
		int hour = dt.getHourOfDay();
		int minutes = dt.getMinuteOfHour();
		
		List<Heating> heating = heatingDao.findAll();
		
		for(Heating heatingBlock : heating){
			int zone = 0;
			switch(heatingBlock.getZone()){
			case "zolder": zone = 0;
			break;
			case "leefruimte": zone = 1;
			break;
			case "badkamer": zone = 2;
			}
			
			String time;
			if (minutes < 10){
				time = hour + ":0" + minutes;
			}
			else{
				time = hour + ":" + minutes;
			}
			
			Byte bitNr = null;
			switch(zone)
			{
			case 0: bitNr = (byte)0b00000000;
			break;
			case 1: bitNr = (byte)0b00000001;
			break;
			case 2: bitNr = (byte)0b00000010;
			break;
			case 3: bitNr = (byte)0b00000011;
			break;
			case 4: bitNr = (byte)0b00000100;
			break;
			case 5: bitNr = (byte)0b00000101;
			break;
			case 6: bitNr = (byte)0b00000110;
			break;
			case 7: bitNr = (byte)0b00000111;
			break;
			}
			
			DeviceManager plc = new DeviceManager();
			String timeCutOn = heatingBlock.getStarttime().toLocalTime().toString().substring(0, 5);
			String timeCutOff= heatingBlock.getStoptime().toLocalTime().toString().substring(0, 5);
			
			
			
			switch (day) {
			case 1:
				if(heatingBlock.getMa() == true){
					if(time == timeCutOn){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, true);
							plc.disconnect();
						}
					}
					if(time == timeCutOff){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, false);
							plc.disconnect();
						}
					}
				}
			break;
			case 2:
				if(heatingBlock.getDi() == true){
					//System.out.println( "system tijd:" + time + "  DB tijd:" + timeCutOn);
					if(time.equals(timeCutOn)){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, true);
							plc.disconnect();
						}
					}
					if(time == timeCutOff){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, false);
							plc.disconnect();
						}
					}
				}
			break;
			case 3:
				if(heatingBlock.getWoe() == true){
					if(time == timeCutOn){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, true);
							plc.disconnect();
						}
					}
					if(time == timeCutOff){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, false);
							plc.disconnect();
						}
					}
				}
			break;
			case 4:
				if(heatingBlock.getDon() == true){
					if(time == timeCutOn){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, true);
							plc.disconnect();
						}
					}
					if(time == timeCutOff){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, false);
							plc.disconnect();
						}
					}
				}
			break;
			case 5:
				if(heatingBlock.getVrij() == true){
					if(time == timeCutOn){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, true);
							plc.disconnect();
						}
					}
					if(time == timeCutOff){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, false);
							plc.disconnect();
						}
					}
				}
			break;
			case 6:
				if(heatingBlock.getZa() == true){
					if(time == timeCutOn){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, true);
							plc.disconnect();
						}
					}
					if(time == timeCutOff){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, false);
							plc.disconnect();
						}
					}
				}
			break;
			case 7:
				if(heatingBlock.getZo() == true){
					if(time == timeCutOn){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, true);
							plc.disconnect();
						}
					}
					if(time == timeCutOff){
						if (plc.connect().HasConnected()){
							plc.writeRequest(eRegion.Flags_Markers, 200, bitNr, false);
							plc.disconnect();
						}
					}
				}
			break;
			}
		}
	}
	
	public void printMe(){
		Date date = new Date();
		System.out.println(date.toString());
	}

}

