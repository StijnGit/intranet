package be.stijn.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PLCCom.eRegion;
import be.stijn.intranet.dao.MerkerDaoImpl;
import be.stijn.intranet.manager.DeviceManager;
import be.stijn.intranet.maps.Merker;

@Service
public class MerkerServiceImpl implements MerkerService{
	
	@Autowired
	private MerkerDaoImpl merkerDaoImpl;
	@Autowired
	private DeviceManager deviceManager;

	@Override
	public List<Merker> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Merker getMerker(int nr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Merker> getFilledPlcDataCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void setMerker(int nr, boolean value) {
		Merker merker = merkerDaoImpl.getByNr(nr);
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
