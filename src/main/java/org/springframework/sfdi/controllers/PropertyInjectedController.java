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
public class PropertyInjectedController {
	
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
