package be.stijn.intranet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeatingController {
	
	@RequestMapping(value = { "/heating" }, method = RequestMethod.GET)
	public void test()
	{}

}