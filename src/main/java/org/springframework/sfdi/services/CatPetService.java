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
@Profile("cat")
@Service("cat")
public class CatPetService implements PetService {

	@Override
	public String getPetType() {
		return "Cats Are the Best!";
	}

}
