/**
 * 
 */
package org.springframework.sfdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author vijayakumar
 * @Since  27-Jan-2022
 *
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

	public PrototypeBean() {
		System.out.println("I'm a prototype bean.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public void getMyScope() {
		System.out.println("I'm a prototype.");
	}
}
