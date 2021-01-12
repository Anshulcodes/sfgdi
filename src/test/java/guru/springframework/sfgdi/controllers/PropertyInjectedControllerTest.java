package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	void setUp()
	{
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService= new ConstructorGreetingService();
		
	}
	
	@Test
	void testGetGreeting() {
		System.out.println(propertyInjectedController.getGreeting());
	}

}
