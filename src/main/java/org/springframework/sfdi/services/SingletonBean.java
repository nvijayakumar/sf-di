/**
 * 
 */
package org.springframework.sfdi.services;

import org.springframework.stereotype.Component;

/**
 * @author vijayakumar
 * @Since  27-Jan-2022
 *
 */
@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("I'm a singleton bean.!!!!!!!!!!!!");
	}

	public void getMyScope() {
		System.out.println("I'm a Singleton");
	}
}
