package com.roomofwar.util;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.roomofwar.customexception.DataNullException;
import com.roomofwar.service.Character;
import com.roomofwar.constants.Constants;

/** Serialize the object and persist to storage. 
 * 
 * @author Vaibhav53
 *
 */
public class SaveStateOfGame {

	/**takes map contains character and data.Its get serialized 
	 *  and saved to storage
	 *  
	 * @param character   Map of character 
	 * @param name        name of player
	 */
	public void saveState(Map<String, Character> character, String name) {		
		for(Map.Entry<String, Character> map :character.entrySet()){
			try {
				saveState(map.getValue(), map.getKey(),name);
			} catch (Exception e) {				
				System.out.println(e.getMessage());
			}
		}
	}

	/**Method checks the character data is null or not.
	 *  if null throw exception else persist the object to storage
	 * 
	 * @param character     {@code Character} object
	 * @param charType       String name of character
	 * @param name           name of player
	 * @throws Exception     {@code DataNullException} 
	 */
	public void saveState(Character character,String charType, String name) throws Exception {		
			if(character!=null) {
				try (FileOutputStream fileOut = new FileOutputStream(name+charType+Constants.fileExtension)){
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(character);
			out.close();
			fileOut.close();			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		} 
			else 
			{				
				throw new DataNullException("Not able to save the state for "+charType);		
			}
	}	
}
