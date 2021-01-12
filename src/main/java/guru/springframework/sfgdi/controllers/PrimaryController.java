package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PrimaryController {

	GreetingService greetingService;
	
	public PrimaryController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
