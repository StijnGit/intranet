package be.stijn.intranet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PLCCom.eRegion;
import be.stijn.intranet.dao.InputDao;
import be.stijn.intranet.manager.DeviceManager;
import be.stijn.intranet.model.Input;

@Service
public class InputServiceImpl implements InputService{
	
	@Autowired
	private InputDao inputDao;
	
	@Autowired
	private DeviceManager plc;

	@Transactional
	public List<Input> findAll() {
		return inputDao.findAll();
	}
	
	@Override
	@Transactional
	public List<Input> getFilledPlcDataCommand() {
		Input input = new Input();
	    List<Input> inputs = new ArrayList<Input>();

		if (plc.connect().HasConnected()) {
			boolean resIn[] = plc.readRequest(eRegion.Input);
			
			for (int i = 0; i < resIn.length; ++i)
			{
				input = getInput(i);
				if (input != null){
					input.setValue(resIn[i]);
					inputs.add(input);
				}
			}
			plc.disconnect();
		}
		
		else
		{
			//Test data als er geen PLC aanwezig is
			boolean resIn[] = {
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
			
			for (int i = 0; i < resIn.length; ++i)
			{
				input = getInput(i);
				if (input != null){
					input.setValue(resIn[i]);
					inputs.add(input);
				}
			}
		}
		
		return inputs;
	}

	@Override
	public Input getInput(int nr) {
		return inputDao.findByNr(nr);
	}



}
