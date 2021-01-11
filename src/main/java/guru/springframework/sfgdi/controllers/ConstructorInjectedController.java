package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService service;

	@Autowired
	public ConstructorInjectedController(GreetingService service) {
		super();
		this.service = service;
	}
	
	public String getGreeting()
	{
		return service.sayGreeting();
	}
}
