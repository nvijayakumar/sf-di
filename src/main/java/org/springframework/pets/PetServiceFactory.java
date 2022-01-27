/**
 * 
 */
package org.springframework.pets;

/**
 * @author vijayakumar
 * @Since  27-Jan-2022
 *
 */
public class PetServiceFactory {

	public PetService getPetService(String petType) {
		
		switch (petType) {
		case "dog":
			return new DogPetService();
		case "cat":
			return new CatPetService();
		default:
			return new DogPetService();
		}
	}
}
