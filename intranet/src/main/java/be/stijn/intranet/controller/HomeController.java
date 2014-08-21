package be.stijn.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.stijn.intranet.maps.Output;
import be.stijn.intranet.service.OutputService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private OutputService outputService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String list(Model model) {
		List<Output> outputs = outputService.findAll();
		model.addAttribute("outputs", outputs);

		return "home";
	}

	


}
