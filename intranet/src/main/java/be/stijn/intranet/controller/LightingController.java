package be.stijn.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.stijn.intranet.command.PlcDataCommand;
import be.stijn.intranet.maps.Output;
import be.stijn.intranet.service.MerkerService;
import be.stijn.intranet.service.OutputService;

@Controller
public class LightingController {
	
	@Autowired
	private OutputService outputService;
	@Autowired
	private MerkerService merkerService;

	@RequestMapping(value = { "/lighting" }, method = RequestMethod.GET)
	public String list(Model model) {
		
		PlcDataCommand cmd = new PlcDataCommand();
		
		List<Output> output = outputService.getFilledPlcDataCommand();
		model.addAttribute("output", output);
		for (Output outp : output ){
			cmd.addPlcOutputData(outp);
		}
		model.addAttribute("command", cmd);
		return "/lighting";
	}
	
	@RequestMapping(value = { "/lighting" }, method = RequestMethod.POST)
	public void list(@RequestBody Output output, @ModelAttribute PlcDataCommand cmd, Model model) {

		merkerService.setMerker(output.getNr(), output.getValue());
	}
}