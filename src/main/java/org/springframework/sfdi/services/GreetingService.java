/**
 * 
 */
package org.springframework.sfdi.services;

import org.springframework.stereotype.Component;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
@Component
public interface GreetingService {

	String sayGreeting();
	
	default String sayDefaultGreeting() {
		return "Default Greetings";
	}
}
