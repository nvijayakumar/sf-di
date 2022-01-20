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
class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}

	/**
	 * Test method for {@link org.springframework.sfdi.controllers.PropertyInjectedController#getGreeting()}.
	 */
	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
