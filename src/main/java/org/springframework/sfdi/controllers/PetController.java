/**
 * 
 */
package org.springframework.sfdi.controllers;

import org.springframework.sfdi.services.PetService;
import org.springframework.stereotype.Controller;

/**
 * @author vijayakumar
 * @Since  20-Jan-2022
 *
 */
@Controller
public class PetController {

	private final PetService petService;
	
	public PetController(PetService petService) {
		this.petService = petService;
	}
	
	public String whichPetIsTheBest() {
		return petService.getPetType();
	}
}
