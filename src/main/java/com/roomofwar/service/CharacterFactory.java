package com.roomofwar.service;

import java.util.List;

import com.roomofwar.constants.Constants;

/** {@code CharacterFactory} class responsible to
 *   serve the object of {@code Character}
 * 
 * @author Vaibhav53
 *
 */
public class CharacterFactory {
	
private static CharacterFactory characterFactory;
	
	private CharacterFactory() {
		
	}
	
	 public static CharacterFactory getInstance(){
	        if(characterFactory == null){
	        	characterFactory = new CharacterFactory();
	        }
	        return characterFactory;
	    }

	/** Method return custom character Object	 * 
	 * 
	 * @param charaterType  name of character
	 * @param name           player Name 
	 * @param role           role of character
	 * @param health         health of character in integer
	 * @param experience     experience of character in integer
	 * @param isPoisonous    true or false
	 * @param rating
	 * @param weapons         list of weapons
	 * @return
	 */
	public Character getCharacter(String charaterType, String name,String role, Integer health, Integer experience, boolean isPoisonous, Integer rating,
			List<String> weapons) {		
		if(charaterType.equalsIgnoreCase("player")) {			
			return new Player(name,role,health,experience,isPoisonous,rating,weapons);
		}else {
			return new Enemy(name,role,health,experience,isPoisonous,rating,weapons);
		}		
}
	
	/**Method return default Character
	 * 
	 * @param charaterType   name of character
	 * @return               Character Object
	 */
	public Character getCharacter(String charaterType) {		
		if(charaterType.equalsIgnoreCase("player")) {		
			return new Player(Constants.playerName, Constants.playerRoleName, Constants.playerHealth, Constants.playerExperince, Constants.pisPoisonous, Constants.playerRating,
					Constants.playerWeaponList);
		}else {	
			return new Enemy(Constants.enemyName, Constants.enemyRoleName, Constants.enemyHealth, Constants.enemyExperince,Constants.eisPoisonous, Constants.enemyRating,
					Constants.enemyWeaponList);
		}	
	}
}
