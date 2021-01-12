package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService service;

	public GreetingService getService() {
		return service;
	}

	@Qualifier("setterGreetingService")
	@Autowired
	public void setService(GreetingService service) {
		this.service = service;
	}
	
	public String getGreeting()
	{
		return service.sayGreeting();
	}
	
}
