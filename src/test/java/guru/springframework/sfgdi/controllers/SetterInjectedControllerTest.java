package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		controller= new SetterInjectedController();
		controller.setService(new GreetingServiceImpl());
		
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
