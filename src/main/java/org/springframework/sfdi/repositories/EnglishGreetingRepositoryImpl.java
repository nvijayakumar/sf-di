/**
 * 
 */
package org.springframework.sfdi.repositories;

/**
 * @author vijayakumar
 * @Since  27-Jan-2022
 *
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

	@Override
	public String sayGreeting() {
		return "Hello World - EN.";
	}

}
