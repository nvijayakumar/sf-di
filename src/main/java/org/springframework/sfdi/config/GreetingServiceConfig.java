/**
 * 
 */
package org.springframework.sfdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.sfdi.repositories.EnglishGreetingRepository;
import org.springframework.sfdi.repositories.EnglishGreetingRepositoryImpl;
import org.springframework.sfdi.services.ConstructorInjectedGreetingService;
import org.springframework.sfdi.services.GreetingServiceImpl;
import org.springframework.sfdi.services.I18nGreetingServiceEN;
import org.springframework.sfdi.services.I18nGreetingServiceES;
import org.springframework.sfdi.services.PropertyInjectedGreetingService;
import org.springframework.sfdi.services.SetterInjectedGreetingService;

/**
 * @author vijayakumar
 * @Since  27-Jan-2022
 *
 */
@Configuration
public class GreetingServiceConfig {
	
	@Profile("ES")
	@Bean("i18nService")
	I18nGreetingServiceES i18nGreetingServiceES() {
		return new I18nGreetingServiceES();
	}
	
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile({"EN", "default"})
	@Bean
	I18nGreetingServiceEN i18nService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nGreetingServiceEN(englishGreetingRepository);
	}

	@Bean
	ConstructorInjectedGreetingService constructorInjectedGreetingService() {
		return new ConstructorInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	GreetingServiceImpl greetingServiceImpl() {
		return new GreetingServiceImpl();
	}
}
