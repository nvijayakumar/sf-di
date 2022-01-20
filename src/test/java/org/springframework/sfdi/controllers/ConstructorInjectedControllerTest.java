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
class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	/**
	 * Test method for {@link org.springframework.sfdi.controllers.ConstructorInjectedController#getGreeting()}.
	 */
	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
