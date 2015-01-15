package be.stijn.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.stijn.intranet.model.Input;
import be.stijn.intranet.service.InputService;


@Controller
public class HomeController {


	//private OutputService outputService;
	@Autowired
	private InputService inputService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
//	public String list(Model model) {
//		List<Output> outputs = outputService.getFilledPlcDataCommand();
//		model.addAttribute("outputs", outputs);
//
//		return "home";
	public String list(Model model) {
		List<Input> inputs = inputService.getFilledPlcDataCommand();
		model.addAttribute("inputs", inputs);
		
		return "home";
	}

}
