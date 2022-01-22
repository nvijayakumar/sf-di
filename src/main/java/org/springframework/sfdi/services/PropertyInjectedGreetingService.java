/**
 * 
 */
package org.springframework.sfdi.services;

import org.springframework.stereotype.Service;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Property";
	}

}
