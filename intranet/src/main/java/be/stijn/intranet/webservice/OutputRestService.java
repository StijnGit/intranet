package be.stijn.intranet.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import be.stijn.intranet.maps.Output;
import be.stijn.intranet.service.OutputService;

@Path("json/outputs")
public class OutputRestService {
	
	
//	public List<Output> getOutputsInJSON() {
//		OutputService outputService = new OutputServiceImpl();
//		return outputService.getFilledPlcDataCommand();
//	}
	
	@Autowired
	private OutputService outputService;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	


	public List<Output> outputs(){
		List<Output> outputs = outputService.getFilledPlcDataCommand();
		return outputs;
	}
	
//	public String test (){
//		return "test of de webservice werkt";
//		
//	}
}
