package be.stijn.intranet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PLCCom.eRegion;
import be.stijn.intranet.dao.OutputDao;
import be.stijn.intranet.manager.DeviceManager;
import be.stijn.intranet.model.Output;

@Service
public class OutputServiceImpl implements OutputService {

	@Autowired
	private OutputDao outputDao;
	
	@Autowired
	private DeviceManager plc;
	
	@Transactional
	public List<Output> findAll() {
		return outputDao.findAll();
	}
	
	@Override
	@Transactional
	public List<Output> getFilledPlcDataCommand(){
		Output output = new Output();
	    List<Output> outputs = new ArrayList<Output>();

		if (plc.connect().HasConnected()){
			boolean resOut[] = plc.readRequest(eRegion.Output);
			
			for (int i = 0; i < resOut.length; ++i)
			{
				output = getOutput(i);
				if (output != null){
					output.setValue(resOut[i]);
					outputs.add(output);
				}
			}
			plc.disconnect();
		}
		
		else
		{
			//Test data als er geen PLC aanwezig is
			boolean resOut[] = {true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false} ;
			
			for (int i = 0; i < resOut.length; ++i)
			{
				output = getOutput(i);
				if (output != null){
					output.setValue(resOut[i]);
					outputs.add(output);
				}
			}
		}
		
		return outputs;
	}

	@Override
	@Transactional
	public Output getOutput(int nr) {
		return outputDao.findByNr(nr);
	}

	
	
}
