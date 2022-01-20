/**
 * 
 */
package org.springframework.sfdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.sfdi.services.GreetingServiceImpl;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		
		controller.setGreetingService(new GreetingServiceImpl());
	}

	/**
	 * Test method for {@link org.springframework.sfdi.controllers.SetterInjectedController#getGreeting()}.
	 */
	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
