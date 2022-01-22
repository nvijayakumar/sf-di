/**
 * 
 */
package org.springframework.sfdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.sfdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
@Controller
public class I18nController {

	private final GreetingService greetingService;
	
	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
