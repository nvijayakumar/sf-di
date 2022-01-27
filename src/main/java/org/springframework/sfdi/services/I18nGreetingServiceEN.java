/**
 * 
 */
package org.springframework.sfdi.services;

import org.springframework.sfdi.repositories.EnglishGreetingRepository;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
public class I18nGreetingServiceEN implements GreetingService {

	private final EnglishGreetingRepository englishGreetingRepository;

	public I18nGreetingServiceEN(EnglishGreetingRepository englishGreetingRepository) {
		this.englishGreetingRepository = englishGreetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		return englishGreetingRepository.sayGreeting();
	}

}
