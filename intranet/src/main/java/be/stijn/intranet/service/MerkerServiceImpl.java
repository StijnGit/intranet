package be.stijn.intranet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PLCCom.eRegion;
import be.stijn.intranet.dao.MerkerDao;
import be.stijn.intranet.manager.DeviceManager;
import be.stijn.intranet.model.Merker;

@Service
public class MerkerServiceImpl implements MerkerService{
	
	@Autowired
	private MerkerDao merkerDao;

	@Transactional
	public List<Merker> findAll() {
		return merkerDao.findAll();
	}

	@Override
	@Transactional
	public Merker getMerker(int nr) {
		return merkerDao.getByNr(nr);
	}

	@Override
	@Transactional
	public List<Merker> getFilledPlcDataCommand() {
		Merker merker = new Merker();
		List<Merker> merkers = new ArrayList<Merker>();
		
		DeviceManager plc = new DeviceManager();
		
		if (plc.connect().HasConnected()){
			boolean resMer[] = plc.readRequest(eRegion.Flags_Markers);
			for (int i = 0; i < resMer.length; ++i)
			{
				merker = getMerker(i);
				if (merker != null){
					merker.setValue(resMer[i]);
					merkers.add(merker);
				}
			}
			plc.disconnect();
		}
		else
		{
			//Test data als er geen PLC aanwezig is
			boolean resMer[] = {
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false, 
					true, false,
					true, false, 
					true, false, 
					true, false,
					true, false,
					true, false, 
					true, false, 
					true, false,
					true, false,
					true, false} ;
			
			for (int i = 0; i < resMer.length; ++i)
			{
				merker = getMerker(i);
				if (merker != null){
					merker.setValue(resMer[i]);
					merkers.add(merker);
				}
			}
		}
		return merkers;
	}

	@Override
	@Transactional
	public void setMerker(int nr, boolean value) {
		Merker merker = merkerDao.getByNr(nr);
		merker.setValue(value);
		Byte bitNr = null;
		switch(merker.getBit())
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
		System.out.println("Merker:" + merker.getWord() + "." + bitNr);
				
		DeviceManager plc = new DeviceManager();
		if (plc.connect().HasConnected()){
			plc.writeRequest(eRegion.Flags_Markers, merker.getWord(), bitNr, true);
		}
		plc.disconnect();
		
	}


	

}
