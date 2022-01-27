/**
 * 
 */
package org.springframework.sfdi.services;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
public interface GreetingService {

	String sayGreeting();
	
	default String sayDefaultGreeting() {
		return "Default Greetings";
	}
}
