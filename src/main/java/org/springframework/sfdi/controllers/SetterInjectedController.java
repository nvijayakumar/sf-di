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
public class SetterInjectedController {
	
	private GreetingService greetingService;

	@Autowired
	@Qualifier("setterInjectedGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
