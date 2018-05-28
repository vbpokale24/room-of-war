package com.roomofwar.main;

import java.util.Scanner;

import com.roomofwar.constants.Constants;
import com.roomofwar.service.Character;
import com.roomofwar.util.Validateinputs;


/** The class {@code CharacterFight} include method  
 *   Which invoke another method from class {@code Character} to start 
 *   the fight between two character
 * 
 * @author Vaibhav53
 *
 */
public class CharacterFight {
	
	
    private static CharacterFight characterFight;
	
	private CharacterFight() {
		
	}
	
	 public static CharacterFight getInstance(){
	        if(characterFight == null){
	        	characterFight = new CharacterFight();
	        }
	        return characterFight;
	    }

	/** Start the fight between two character by invoking the
	 *   fight method from class {@code Character} which returns the result of fight.
	 *    
	 * @param sc
	 *          {@code Scanner} 
	 * @param player
	 *          Instance of {@code Character} class
	 * @param enemy
	 *          Instance of {@code Character} class
	 */
	public void startTheFight(Scanner sc,com.roomofwar.service.Character player, Character enemy) {
		if (player != null && enemy != null) {
			System.out.println("Select a Weapon for attack");
			System.out.println(
					"1 for Health! 2 for Experince! 3 for rating! 4 for weapons! 5 for Poison!");
			int weaponNo;
			if (sc.hasNextInt()) {
				 weaponNo = sc.nextInt();
				if (new Validateinputs().validateWeaponInput(weaponNo)) {
					player.fight(player, enemy, weaponNo);
				} else {					
					weaponNo = Constants.defaultWeaponNo; // Default weapon no assigned
					System.out.println("Defualt weapon no  "+weaponNo+" is assigned");
					player.fight(player, enemy, weaponNo);
				}
			} else {
				sc.next();
				weaponNo = Constants.defaultWeaponNo; // Default weapon no assigned
				System.out.println("Defualt weapon no  "+weaponNo+" is assigned");
				player.fight(player, enemy, weaponNo);
			}
		} else {
			System.out.println("Either Player or Enemy is missing");
		}
	}
}
