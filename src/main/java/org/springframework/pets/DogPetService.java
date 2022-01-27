/**
 * 
 */
package org.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {

	@Override
	public String getPetType() {
		return "Dogs Are the Best!";
	}

}
