package be.stijn.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import be.stijn.intranet.command.PlcDataCommand;
import be.stijn.intranet.maps.Heating;
import be.stijn.intranet.maps.Input;
import be.stijn.intranet.maps.Output;
import be.stijn.intranet.service.HeatingService;
import be.stijn.intranet.service.InputService;
import be.stijn.intranet.service.OutputService;

@Controller
public class HeatingController {
	
	
	@Autowired
	private OutputService outputService;
	@Autowired
	private InputService inputService;
	@Autowired
	private HeatingService heatingService;

	
	@RequestMapping(value = { "/heating" }, method = RequestMethod.GET)
	public String list(Model model) {
		
		PlcDataCommand cmd = new PlcDataCommand();
		
		List<Output> output = outputService.getFilledPlcDataCommand();
		model.addAttribute("output", output);
		for (Output outp : output){
			cmd.addPlcOutputData(outp);
		}
		
		List<Input> input = inputService.getFilledPlcDataCommand();
		model.addAttribute("input", input);
		for(Input inp : input){
			cmd.addPlcInputData(inp);
		}
				
		model.addAttribute("command", cmd);
		return "/heating";
	}
	
	@RequestMapping(value = {"/heating/{zone}"}, method = RequestMethod.POST)
	@ResponseBody
	public String list(@RequestBody Heating heating, @PathVariable("zone") String zone) {
		heatingService.addHeating(heating);
		return "/heating";
	}

	@RequestMapping(value = {"/heating/{zone}"}, method = RequestMethod.GET)
	@ResponseBody
	public List<Heating> getZoneData(@PathVariable("zone") String zone) {
		List<Heating> heatingData = heatingService.findByZone(zone);
		return heatingData;
	}
	
	@RequestMapping(value= {"/heatingedit"}, method = RequestMethod.POST)
	@ResponseBody
	public String edit(@RequestBody Heating heating){
		heatingService.editHeating(heating);
		return "/heating";
	}
	
	@RequestMapping(value= {"/heatingdelete"}, method = RequestMethod.POST)
	@ResponseBody
	public String delete(@RequestBody Heating heating){
		heatingService.deleteHeating(heating);
		return "/heating";
	}

}
