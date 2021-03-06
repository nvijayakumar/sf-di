/**
 * 
 */
package org.springframework.sfdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.sfdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("propertyInjectedGreetingService")
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
