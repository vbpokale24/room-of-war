package com.roomofwar.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.roomofwar.constants.Constants;
import com.roomofwar.service.CharacterFactory;
import com.roomofwar.util.Validateinputs;

public class CreateCustomCharacter {

	static com.roomofwar.service.Character createcharacter(Scanner sc, String type) {
		
		String name = null;
		String role = null;
		Integer health = null;
		Integer experience = null;
		Integer rating = null;
		List<String> weapons = null;
		boolean isPoisonous = false;
		int count = 0;		
		System.out.println("       **************             ");
		do {			
			count++;
			switch (count) {
			case 1:
				System.out.println("Enter name for character");
				name = sc.next();
				break;
			case 2:
				System.out.println("Enter a role for the character (Out of KING, WARRIOR, ARCHER)");
				role = sc.next();				
				break;
			case 3:
				System.out.println("Enter the health for character between 1 to 100");
				health = validateValue(sc);
				break;
			case 4:
				System.out.println("Enter the experience for character between 1 to 100");
				experience = validateValue(sc);				
				break;
			case 5:
				System.out.println("Enter the rating for character between 1 to 100");
				rating = validateValue(sc);				
				break;
			case 6:
				System.out.println("How many weapons do you need : 1 to 5");
				int wcount = 0;
				if(sc.hasNextInt()) {
					 wcount = sc.nextInt();	
				}
				else {
					wcount = 2;   //By default value is assigned
				}				
				weapons = new ArrayList<String>();
				while (wcount > 0) {
					System.out.println("Enter the name of weapon ::");
					weapons.add(sc.next());
					wcount--;
				}				
				break;
			case 7:
				System.out.println("Whether character can infect poison :: true or false");
				if(sc.hasNextBoolean()) {
				isPoisonous = sc.nextBoolean();
				}else {
					isPoisonous = false;
					sc.next();	
				}			
							
				break;
			}
		
		} while (count < 8);
		return CharacterFactory.getInstance().getCharacter(type, name, role, health, experience, isPoisonous, rating, weapons);
	}
	
	protected  static int validateValue(Scanner sc) {
		Integer value = null;
		if(sc.hasNextInt()) {
			 value = sc.nextInt();
			if(new Validateinputs().validateInput(value))
			{
				return value;
				
			}else {
				System.out.println("Value must be between 1 to 100");
				value =  Constants.defualtValue;
				System.out.println("Defualt value "+value+" is assigned");
			}				
		}else {			
			sc.next();
			value =  Constants.defualtValue;
			System.out.println("Defualt value "+value+" is assigned");
		}
		return value;
	}
}
