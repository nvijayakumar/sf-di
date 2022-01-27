/**
 * 
 */
package org.springframework.pets;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
//@Profile({"dog", "default"}) -- moved to java based DI
//@Service
public class DogPetService implements PetService {

	@Override
	public String getPetType() {
		return "Dogs Are the Best!";
	}

}
