package be.stijn.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.stijn.intranet.command.PlcDataCommand;
import be.stijn.intranet.maps.Input;
import be.stijn.intranet.maps.Output;
import be.stijn.intranet.service.InputService;
import be.stijn.intranet.service.OutputService;

@Controller
public class HeatingController {
	
	@Autowired
	private OutputService outputService;
	@Autowired
	private InputService inputService;

	
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

}
