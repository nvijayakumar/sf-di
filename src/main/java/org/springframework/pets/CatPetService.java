/**
 * 
 */
package org.springframework.pets;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
//@Profile("cat") -- moved to java based DI
//@Service
public class CatPetService implements PetService {

	@Override
	public String getPetType() {
		return "Cats Are the Best!";
	}

}
