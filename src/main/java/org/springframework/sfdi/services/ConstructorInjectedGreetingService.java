/**
 * 
 */
package org.springframework.sfdi.services;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
public class ConstructorInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
