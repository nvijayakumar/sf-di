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
public class SetterInjectedController {
	
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
