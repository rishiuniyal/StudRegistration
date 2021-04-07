package com.cognizant.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cognizant")
public class WelcomeRestController {
	
	//@RequestMapping("/welcome")
	//@RequestMapping(path="/welcome", method=RequestMethod.GET)
	@GetMapping(value="/welcome")
	public String welcomeRest() {
		
		String msg="Welcome Controller!";
		return msg;
	}
}
