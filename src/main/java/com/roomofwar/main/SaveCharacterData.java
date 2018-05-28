package com.roomofwar.main;

import java.util.HashMap;
import java.util.Scanner;
import com.roomofwar.service.Character;
import com.roomofwar.util.SaveStateOfGame;


/**This class takes the scanner input from user and 
 *  invoke the {@code SaveStateOfGame} class method 
 *  for Character.class object {@code Serializable}
 * 
 * @author Vaibhav53
 *
 */
public class SaveCharacterData {
	
	private static SaveCharacterData saveCharacterData;
	
	private SaveCharacterData() {
		
	}
	
	 public static SaveCharacterData getInstance(){
	        if(saveCharacterData == null){
	        	saveCharacterData = new SaveCharacterData();
	        }
	        return saveCharacterData;
	    }
	/**Invoke SaveState function of {@code SaveStateOfGame}.
	 *  It serialize the character class object 
	 * 
	 * @param sc  
	 *         {@code Scanner} 
	 * @param player
	 *         Instance of {@code Character} class
	 * @param enemy
	 *         Instance of {@code Character} class
	 * @param playerName
	 *         String that is name of player
	 */
	public void saveData( Scanner sc, Character player, Character enemy , String playerName) {	
			System.out.println("****Do you want to save the character and game. Press 'y'  *****");
			String saveStateans = sc.next();
			if (saveStateans.equals("y")) {				
				java.util.Map<String, Character> characterMap = new HashMap();
				characterMap.put("player", player);
				characterMap.put("enemy", enemy);
				new SaveStateOfGame().saveState(characterMap, playerName);
			}
		}
	
}
