/**
 * 
 */
package org.springframework.sfdi.controllers;

import org.springframework.sfdi.services.GreetingService;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
