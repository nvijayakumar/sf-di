/**
 * 
 */
package org.springframework.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nGreetingServiceEN implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - EN";
	}

}
